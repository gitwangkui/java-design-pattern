package com.redmaple.service.impl;

import com.redmaple.service.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * @author 若成风
 * @description 具体实现的角色
 * @date 2020/11/12 22:19
 * @copyright (c) 2020, all rights reserved
 **/
@Service
public class WeChatPayStrategy implements PayStrategy {

    /**
     * @description:
     * @author: 若成风
     * @date: 2020/11/12 22:21
     * @return: 
     */
    @Override
    public String toPayHtml() {
        return "调用微信支付接口";
    }
}
