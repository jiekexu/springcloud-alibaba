/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.nacos.consumer.rest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * @author xjc
 * @version $Id: ConsumerController.java, v 0.1 2019年09月24日 xjc 17:35  Exp $
 */
@RestController
public class ConsumerController {

    private static final String NACOS_PROVIDER = "nacos-provider";

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("services")
    public Object services() {
        return loadBalancerClient.choose(NACOS_PROVIDER);
    }

    @GetMapping(value = "/echo")
    public String echo() {
        ServiceInstance serviceInstance = loadBalancerClient.choose(NACOS_PROVIDER);
        String url = String.format("http://%s:%s/echo/%s", serviceInstance.getHost(), serviceInstance.getPort(), appName);
        return new RestTemplate().getForObject(url, String.class);
    }

}