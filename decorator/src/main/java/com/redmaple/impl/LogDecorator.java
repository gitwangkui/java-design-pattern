package com.redmaple.impl;

import com.redmaple.AbstractDecorator;
import com.redmaple.GatewayComponent;

/**
 * @author 若成风
 * @description
 * @date 2021/5/13 23:01
 * @copyright (c) 2021, all rights reserved
 **/
public class LogDecorator extends AbstractDecorator {

    public LogDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println(">>>第二步：收集日志。。。");
    }
}
