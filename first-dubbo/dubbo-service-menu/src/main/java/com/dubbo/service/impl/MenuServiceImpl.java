package com.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.service.MenuService;

public class MenuServiceImpl implements MenuService {

	public List<String> queryMenus() {
		List<String> menus = new ArrayList<String>();
		menus.add("System");
		
		return menus;
	}
	
}
