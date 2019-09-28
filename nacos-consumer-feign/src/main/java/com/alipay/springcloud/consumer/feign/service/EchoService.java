/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xjc
 * @version $Id: EchoService.java, v 0.1 2019年09月25日 15:42 xjc Exp $
 */
@FeignClient(value = "nacos-provider")
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);

}