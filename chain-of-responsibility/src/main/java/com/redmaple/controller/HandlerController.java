package com.redmaple.controller;

import com.redmaple.handler.GatewayHandler;
import com.redmaple.handler.factory.FactoryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.redmaple.service.GatewayHandlerService;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: HandlerController
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/5/921:22
 */
@RestController
public class HandlerController {
    @Autowired
    private GatewayHandlerService gatewayHandlerService;

    @RequestMapping("/client")
    public String client() {
//        GatewayHandler gatewayHandler = FactoryHandler.getFirstGatewayHandler();
//        gatewayHandler.service();
        GatewayHandler firstGatewayHandler = gatewayHandlerService.getFirstGatewayHandler();
        firstGatewayHandler.service();
        return "success";
    }
}

