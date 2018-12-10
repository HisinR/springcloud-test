package com.hisin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.hisin.springcloud.entities.SysRole;

@RestController
public class ConsumerController {
	
//	private final static String URL="http://localhost:8001";
	private final static String URL_8001="http://microservicecloud-sysrole-8001";
	private final static String URL_8002="http://microservicecloud-sysrole-8002";
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/findsysRole",method=RequestMethod.GET)
	public List<SysRole> getSysRole(){
		return  restTemplate.getForObject(URL_8001+"/search", List.class);
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/findItem",method=RequestMethod.GET)
	public List<SysRole> getItem(){
		return  restTemplate.getForObject(URL_8002+"/item/search", List.class);
	}
}
