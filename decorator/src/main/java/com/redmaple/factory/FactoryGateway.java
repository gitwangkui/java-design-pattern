package com.redmaple.factory;

import com.redmaple.AbstractDecorator;
import com.redmaple.GatewayComponent;
import com.redmaple.impl.BasicGatewayComponent;
import com.redmaple.impl.LimitDecorator;
import com.redmaple.impl.LogDecorator;

/**
 * @author 若成风
 * @description
 * @date 2021/5/13 23:08
 * @copyright (c) 2021, all rights reserved
 **/
public class FactoryGateway {

    public static GatewayComponent getGatewayComponent(){
        return new LimitDecorator(new LogDecorator(new BasicGatewayComponent()));
//        return new LogDecorator(new LimitDecorator(new BasicGatewayComponent()));
    }

    public static void main(String[] args) {
        GatewayComponent gatewayComponent = FactoryGateway.getGatewayComponent();
        gatewayComponent.service();
    }

}
