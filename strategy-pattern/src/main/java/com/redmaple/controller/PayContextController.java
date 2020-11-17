package com.redmaple.controller;

import com.redmaple.mapper.PaymentChannelMapper;
import com.redmaple.model.PaymentChannelEntity;
import com.redmaple.service.PayStrategy;
import com.redmaple.utils.SpringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayContextController {

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;
    @Autowired
    private SpringUtils springUtils;

    @RequestMapping("/toPayHtml")
    public  String toPayHtml(String payCode){
        // 1.验证参数
        if(StringUtils.isEmpty(payCode)){
            return  "payCode不能为空!";
        }
        // 2.使用PayCode查询
        PaymentChannelEntity paymentChannel = paymentChannelMapper.getPaymentChannel(payCode);
        if(paymentChannel==null){
            return  "该渠道为空...";
        }
        // 3.获取策略执行的beanid
        String strategyBeanId = paymentChannel.getStrategyBeanId();
        // 4.使用strategyBeanId获取对应spring容器bean信息
        PayStrategy payStrategy = springUtils.getBean(strategyBeanId, PayStrategy.class);
        // 5.执行具体策略算法
        String pay = payStrategy.toPayHtml();
        System.out.println(pay);
        return pay;
    }

}
