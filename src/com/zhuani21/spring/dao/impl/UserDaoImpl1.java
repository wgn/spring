package com.zhuani21.spring.dao.impl;

import com.zhuani21.spring.dao.UserDao;
import com.zhuani21.spring.model.User;

public class UserDaoImpl1 implements UserDao {

	public boolean add(User u) {
		System.out.println("UserDaoImpl1 add runed");
		return false;
	}

	public boolean find(String username, String password) {
		System.out.println("UserDaoImpl1 find runed");
		return false;
	}

}
