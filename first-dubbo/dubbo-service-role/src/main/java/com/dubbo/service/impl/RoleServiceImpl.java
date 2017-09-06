package com.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.dubbo.service.RoleService;

public class RoleServiceImpl implements RoleService {

	public List<String> queryAllRoles() {
		List<String> roles = new ArrayList<String>();
		roles.add("Role");
		
		return roles;
	}

}
