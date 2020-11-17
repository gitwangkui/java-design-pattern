package com.redmaple.handler.impl;

import com.redmaple.handler.GatewayHandler;
import org.springframework.stereotype.Component;

@Component
public class BlacklistHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第二关黑名单拦截判断....");
        nextService();
    }
}
