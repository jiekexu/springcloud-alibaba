/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.springcloud.nacos.provider.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
/**
 *
 * @author xjc
 * @version $Id: NacosProviderRibbonApplication.java, v 0.1 2019年09月25日 12:56 xjc Exp $
 */
public class NacosProviderRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProviderRibbonApplication.class, args);
	}

}
