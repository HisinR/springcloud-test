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
	
	private final static String URL="http://localhost:8001";
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/findsysRole",method=RequestMethod.GET)
	public List<SysRole> getSysRole(){
		return  restTemplate.getForObject(URL+"/search", List.class);
	}
}
