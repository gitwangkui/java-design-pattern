package com.redmaple.handler.factory;

import com.redmaple.handler.GatewayHandler;
import com.redmaple.handler.impl.BlacklistHandler;
import com.redmaple.handler.impl.ConversationHandler;
import com.redmaple.handler.impl.CurrentLimitHandler;

/**
 * @author 若成风
 * @description
 * @date 2020/11/16 21:48
 * @copyright (c) 2020, all rights reserved
 **/
public class FactoryHandler {

    public static GatewayHandler getFirstGatewayHandler(){
        // 1第一次网关限流判断
        GatewayHandler gatewayHandler1 = new CurrentLimitHandler();
        // 2第二关黑名单拦截判断
        GatewayHandler gatewayHandler2 = new BlacklistHandler();
        gatewayHandler1.setNextGatewayHandler(gatewayHandler2);
        // 3第三关用户会话拦截判断
        GatewayHandler gatewayHandler3 = new ConversationHandler();
        gatewayHandler2.setNextGatewayHandler(gatewayHandler3);

        return gatewayHandler1;
    }
}
