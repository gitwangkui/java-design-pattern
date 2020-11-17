package com.redmaple.handler.impl;

import com.redmaple.handler.GatewayHandler;
import org.springframework.stereotype.Component;

/**
 * @author 若成风
 * @description
 * @date 2020/11/16 21:43
 * @copyright (c) 2020, all rights reserved
 **/
@Component
public class CurrentLimitHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("\n== 第一次网关限流判断");
        nextService();
    }
}
