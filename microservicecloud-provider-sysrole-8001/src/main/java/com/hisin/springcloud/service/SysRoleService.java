package com.hisin.springcloud.service;

import java.util.List;

import com.hisin.springcloud.entities.SysRole;

public interface SysRoleService {
	
	boolean addSysRole(SysRole sysRole);
	
	SysRole findById(Integer id);
	
	List<SysRole> findAll();
}
