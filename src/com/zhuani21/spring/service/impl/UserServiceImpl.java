package com.zhuani21.spring.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhuani21.spring.dao.UserDao;
import com.zhuani21.spring.model.User;
import com.zhuani21.spring.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean add(User u) {
		userDao.add(u);
		System.out.println("UserServiceImpl add runed");
		return false;
	}
	@PostConstruct
	public void init(){
		System.out.println("UserServiceImpl init runed");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("UserServiceImpl destroy runed");
	}

}
