package com.redmaple.impl;

import com.redmaple.AbstractDecorator;
import com.redmaple.GatewayComponent;

/**
 * @author 若成风
 * @description
 * @date 2021/5/13 23:04
 * @copyright (c) 2021, all rights reserved
 **/
public class LimitDecorator extends AbstractDecorator {

    public LimitDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println(">>>第三步 API限流。..");
    }
}
