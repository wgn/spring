package com.zhuani21.spring.dao;

import com.zhuani21.spring.model.User;

public interface UserDao {

	public boolean add(User u);
	public boolean find(String username,String password);
}
