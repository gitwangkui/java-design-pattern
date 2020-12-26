package com.redmaple.service.impl;

import com.redmaple.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class AliPaySerciceImpl implements PaymentService {
    @Override
    public void pay() {
        System.out.println("阿里支付对象...");
    }
}
