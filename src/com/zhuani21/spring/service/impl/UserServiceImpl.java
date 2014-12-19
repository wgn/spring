package com.zhuani21.spring.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhuani21.spring.dao.LogDao;
import com.zhuani21.spring.dao.UserDao;
import com.zhuani21.spring.model.Log;
import com.zhuani21.spring.model.User;
import com.zhuani21.spring.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	private LogDao logDao;

	public LogDao getLogDao() {
		return logDao;
	}
	@Resource
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
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
		Log log = new Log();
		log.setMsg("a user is add ,it's id:" + u.getId());
		logDao.add(log);
		return false;
	}
}
