/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author xjc
 * @version $Id: EchoService.java, v 0.1 2019年09月25日 15:42 xjc Exp $
 */
@FeignClient(value = "nacos-provider")
public interface EchoService {

    String echo(String message);

}