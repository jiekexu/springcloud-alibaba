/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
/**
 * @author xjc
 * @version $Id: ConsumerFeignApplication.java, v 0.1 2019年09月25日 xjc 15:32 Exp $
 */
public class ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApplication.class, args);
	}

}
