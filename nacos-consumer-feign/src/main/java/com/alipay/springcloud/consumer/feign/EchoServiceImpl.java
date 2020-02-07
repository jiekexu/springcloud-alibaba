package com.alipay.springcloud.consumer.feign;

import com.alipay.springcloud.consumer.feign.service.EchoService;

public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "hi" + message;
    }
}
