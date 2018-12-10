package com.hisin.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hisin.springcloud.dao.ItemMapper;
import com.hisin.springcloud.entities.Item;
import com.hisin.springcloud.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public List<Item> findAll() {
		return itemMapper.findAll();
	}

}
