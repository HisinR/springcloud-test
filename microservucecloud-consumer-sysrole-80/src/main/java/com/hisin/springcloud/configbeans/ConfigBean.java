package com.hisin.springcloud.configbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	public  RestTemplate geTemplate() {
		return new RestTemplate();
	}
}
