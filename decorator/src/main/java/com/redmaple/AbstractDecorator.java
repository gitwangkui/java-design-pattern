package com.redmaple;

/**
 * @author 若成风
 * @description
 * @date 2021/5/13 22:56
 * @copyright (c) 2021, all rights reserved
 **/
public class AbstractDecorator extends GatewayComponent {
    public GatewayComponent gatewayComponent;
    // 通过构造函数
    public AbstractDecorator(GatewayComponent gatewayComponent){
        this.gatewayComponent = gatewayComponent;
    }

    @Override
    public void service() {
        if (gatewayComponent != null) {
            gatewayComponent.service();
        }
    }


}
