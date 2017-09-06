package com.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

	public List<String> queryUserList() {
		List<String> users = new ArrayList<String>();
		users.add("Jeff");
		
		return users;
	}

}
