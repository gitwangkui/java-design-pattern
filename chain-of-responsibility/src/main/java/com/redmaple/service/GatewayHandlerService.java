package com.redmaple.service;

import com.redmaple.handler.GatewayHandler;
import com.redmaple.mapper.GatewayHandlerMapper;
import com.redmaple.model.GatewayHandlerEntity;
import com.redmaple.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

/**
 * @author 若成风
 * @description
 * @date 2020/11/16 21:54
 * @copyright (c) 2020, all rights reserved
 **/
@Service
public class GatewayHandlerService {

    @Autowired
    private GatewayHandlerMapper gatewayHandlerMapper;

    private GatewayHandler firstGatewayHandler;

    public GatewayHandler getFirstGatewayHandler(){
        if (firstGatewayHandler != null) {
            return this.firstGatewayHandler;
        }
        // 1.查询数据库第一个handler的配置
        GatewayHandlerEntity firstEntity = gatewayHandlerMapper.getFirstGatewayHandler();
        if (ObjectUtils.isEmpty(firstEntity)) {
            return null;
        }
        String firstBeanHandlerId = firstEntity.getHandlerId();
        if (StringUtils.isEmpty(firstBeanHandlerId)) {
            return null;
        }
        // 2.从springboot容器中获取第一个handler对象
        GatewayHandler firstGatewayHandler  = SpringUtils.getBean(firstBeanHandlerId, GatewayHandler.class);
        // 3.获取下一个handlerBeanId
        String nextBeanHandlerId = firstEntity.getNextHandlerId();
        // 定义临时循环遍历指针
        GatewayHandler tempNextGatewayHandler = firstGatewayHandler;
        while (!StringUtils.isEmpty(nextBeanHandlerId)) {
            // 4. 从springboot容器获取下一个handler对象
            GatewayHandler nextGatewayHandler  = SpringUtils.getBean(nextBeanHandlerId, GatewayHandler.class);
            if (ObjectUtils.isEmpty(nextGatewayHandler)) {
                break;
            }
            // 5.从数据库查询该hanlder信息
            GatewayHandlerEntity nextGatewayHandlerEntity = gatewayHandlerMapper.getByHandler(nextBeanHandlerId);
            if (nextGatewayHandlerEntity == null) {
                break;
            }
            // 6.设置下一个white循环遍历hanlderid
            nextBeanHandlerId = nextGatewayHandlerEntity.getNextHandlerId();
            tempNextGatewayHandler.setNextGatewayHandler(nextGatewayHandler);
            tempNextGatewayHandler = nextGatewayHandler;
        }
        this.firstGatewayHandler = firstGatewayHandler;
        return firstGatewayHandler;
    }

















}
