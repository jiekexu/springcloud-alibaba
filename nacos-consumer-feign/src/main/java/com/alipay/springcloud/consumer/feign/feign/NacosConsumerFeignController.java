/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.consumer.feign.feign;

import com.alipay.springcloud.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjc
 * @version $Id: echoController.java, v 0.1 2019年09月25日 15:46 xjc Exp $
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
        return echoService.echo("hi feigin");
    }

}