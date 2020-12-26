package com.redmaple.Controller;

import com.redmaple.service.PaymentService;

/**
 * @author 若成风
 * @description
 * @date 2020/12/27 0:40
 * @copyright (c) 2020, all rights reserved
 **/
public class PayMentFactoryTest {
    public static void main(String[] args) {
        PayMentFactory payMentFactory = new PayMentFactory();
        PaymentService ali_pay = payMentFactory.getPaymentService("ali_pay");
        ali_pay.pay();

        PaymentService wechat_pay = payMentFactory.getPaymentService("wechat_pay");
        wechat_pay.pay();

    }
}
