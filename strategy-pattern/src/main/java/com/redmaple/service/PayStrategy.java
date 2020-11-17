package com.redmaple.service;

/**
 * Description: <br/>支付接口
 * date: 2020/11/12 22:16<br/>
 *
 * @author 若成风<br />
 */
public interface PayStrategy {
    /**
     * @description: 共同的算法实现骨架
     * @author: 若成风
     * @date: 2020/11/12 22:17
     * @return:
     */
    public String toPayHtml();
}
