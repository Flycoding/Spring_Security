package com.zhe800.app.service;

import com.zhe800.app.domain.Resource;
import com.zhe800.app.persistence.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
	private ResourceMapper resourceMapper;
	@Override
	public List<Resource> getByRoleId(Integer roleId) {
		return resourceMapper.selectByRoleId(roleId);
	}

}
