package com.hisin.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hisin.springcloud.dao.SysRoleMapper;
import com.hisin.springcloud.entities.SysRole;
import com.hisin.springcloud.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {
	
	@Autowired
	private SysRoleMapper sysRoleDao;

	public boolean addSysRole(SysRole sysRole) {
		return sysRoleDao.addSysRole(sysRole);
	}

	public SysRole findById(Integer id) {
		// TODO Auto-generated method stub
		return sysRoleDao.findById(id);
	}
	/**
	 * 查找所有信息
	 */
	public List<SysRole> findAll() {
		List<SysRole> findAll = sysRoleDao.findAll();
		for (int i = 0; i < findAll.size(); i++) {
			System.out.println("findAll的数据:"+findAll.get(i));
		}
		return sysRoleDao.findAll();
	}
	
}
