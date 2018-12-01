package com.hisin.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hisin.springcloud.entities.SysRole;

@Mapper
public interface SysRoleMapper {
	
	boolean addSysRole(SysRole sysRole);
	
	SysRole findById(Integer id);
	
	List<SysRole> findAll();
}
