/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.nacos.provider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author xjc
 * @version $Id: ProviderController.java, v 0.1 2019年09月24日 17:02 xjc Exp $
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "hello nacos discovery, " + message + ", port is = " + port;
    }

}