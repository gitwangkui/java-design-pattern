package com.redmaple.service.impl;

import com.redmaple.service.PaymentService;

public class WeChatServiceImpl implements PaymentService {
    @Override
    public void pay() {
        System.out.println("微信支付对象...");
    }
}
