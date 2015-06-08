package com.zhe800.app.persistence;

import com.zhe800.app.domain.Resource;

import java.util.List;

public interface ResourceMapper{
	
	/**
	 * 根据角色id获取该角色可以访问的资源
	 * @param roleId
	 * @return
	 */
	List<Resource> selectByRoleId(Integer roleId);
}
