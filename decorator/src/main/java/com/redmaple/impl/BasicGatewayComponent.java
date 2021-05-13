package com.redmaple.impl;

import com.redmaple.GatewayComponent;

/**
 * @author 若成风
 * @description
 * @date 2021/5/13 22:59
 * @copyright (c) 2021, all rights reserved
 **/
public class BasicGatewayComponent extends GatewayComponent {

    @Override
    public void service() {
        System.out.println(">>>第一步：基础的网关组件服务。。。");
    }
}
