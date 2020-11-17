package com.redmaple.service.impl;

import com.redmaple.service.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * @description: 
 * @author: 若成风
 * @date: 2020/11/12 22:22
 * @return: 
 */
@Service
public class XiaoMiPayStrategy implements PayStrategy {
    /**
     * @description:
     * @author: 若成风
     * @date: 2020/11/12 22:22
     * @return: 
     */
    public String toPayHtml() {
        return "调用小米支付接口";
    }
}
