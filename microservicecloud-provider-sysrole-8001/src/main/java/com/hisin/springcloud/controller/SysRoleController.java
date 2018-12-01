package com.hisin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hisin.springcloud.entities.SysRole;
import com.hisin.springcloud.service.SysRoleService;

@RestController
public class SysRoleController {
	
	@Autowired
	private SysRoleService  roleService;
	
	@RequestMapping(value="/insert/role",method=RequestMethod.POST)
	public  boolean add(@RequestBody SysRole sysRole) {
		return roleService.addSysRole(sysRole);
	}
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public  List<SysRole> search() {
		return roleService.findAll();
	}
}
