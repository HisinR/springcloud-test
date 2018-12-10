package com.hisin.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hisin.springcloud.entities.Item;

@Mapper
public interface ItemMapper {
	
	public List<Item> findAll();
}
