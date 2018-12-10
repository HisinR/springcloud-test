package com.hisin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hisin.springcloud.entities.Item;
import com.hisin.springcloud.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/item/search",method=RequestMethod.GET)
	public List<Item> findAll(){
		return itemService.findAll();
	}
}
