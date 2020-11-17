package com.redmaple.handler;

/**
 * @author 若成风
 * @description 定义一个抽象角色
 * @date 2020/11/16 21:39
 * @copyright (c) 2020, all rights reserved
 **/
public abstract class GatewayHandler {

    protected GatewayHandler nextGatewayHandler;

    public GatewayHandler getNextGatewayHandler() {
        return nextGatewayHandler;
    }

    public void setNextGatewayHandler(GatewayHandler nextGatewayHandler) {
        this.nextGatewayHandler = nextGatewayHandler;
    }

    /**
     * @description: 处理业务逻辑
     * @author: 若成风
     * @date: 2020/11/16 21:41
     * @return: true 表示继续执行， false表示不继续执行
     */
    public abstract void service();

    protected void nextService(){
        if (nextGatewayHandler != null) {
            nextGatewayHandler.service();
        }
    }
}
