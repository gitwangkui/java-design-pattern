package com.redmaple.handler.impl;

import com.redmaple.handler.GatewayHandler;
import org.springframework.stereotype.Component;

@Component
public class ConversationHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第三关用户会话拦截判断....");
        nextService();
    }
}
