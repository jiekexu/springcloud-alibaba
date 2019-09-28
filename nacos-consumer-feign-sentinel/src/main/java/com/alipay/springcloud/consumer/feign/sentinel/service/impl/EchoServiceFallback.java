/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.consumer.feign.sentinel.service.impl;

import com.alipay.springcloud.consumer.feign.sentinel.service.EchoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wb-xjc571590
 * @version $Id: EchoServiceFallback.java, v 0.1 2019年09月27日 15:50 wb-xjc571590 Exp $
 */
@Component
public class EchoServiceFallback implements EchoService {

    @Value("${server.port}")
    private String port;

    @Override
    public String echo(String message) {
        return "fallback, port=" + port;
    }

}