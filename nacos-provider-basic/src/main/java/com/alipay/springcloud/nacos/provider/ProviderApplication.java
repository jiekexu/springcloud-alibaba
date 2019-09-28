/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
/**
 * @author xjc
 * @version $Id: ProviderApplication.java, v 0.1 2019年09月24日 17:02 xjc Exp $
 */
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
