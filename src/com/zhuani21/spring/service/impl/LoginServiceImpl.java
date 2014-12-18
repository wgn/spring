package com.zhuani21.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhuani21.spring.dao.UserDao;
import com.zhuani21.spring.model.User;
import com.zhuani21.spring.service.LoginService;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	private UserDao userDao;

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean checkUser(User u) {
		System.out.println("LoginService checkUser runed");
		return userDao.find(u.getUsername(), u.getPassword());
	}

}
