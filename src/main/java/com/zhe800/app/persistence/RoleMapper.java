package com.zhe800.app.persistence;

import com.zhe800.app.domain.Role;

import java.util.List;

public interface RoleMapper{
	
	/**
	 * 根据用户id获取角色集合
	 * @param userId
	 * @return
	 */
	List<Role> selectByUserId(Integer userId);
	
	/**
	 * 查询所有角色
	 * @return
	 */
	List<Role> selectAll();
}
