package com.redmaple.Controller;

import com.redmaple.service.PaymentService;
import com.redmaple.service.impl.AliPaySerciceImpl;
import com.redmaple.service.impl.WeChatServiceImpl;

class PayMentFactory {

    public PaymentService getPaymentService(String payType) {
        PaymentService paymentService = null;
        switch (payType) {
            case "ali_pay":
                paymentService = new AliPaySerciceImpl();
                break;
            case "wechat_pay":
                paymentService = new WeChatServiceImpl();
                break;
        }
        return paymentService;
    }
}
