package com.zhe800.app.service;

import com.zhe800.app.domain.Role;
import com.zhe800.app.persistence.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAll() {
        return roleMapper.selectAll();
    }

}
