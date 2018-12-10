package com.hisin.springcloud.configbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced
	public  RestTemplate geTemplate() {
		return new RestTemplate();
	}
}
