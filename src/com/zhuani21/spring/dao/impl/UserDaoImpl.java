package com.zhuani21.spring.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhuani21.spring.dao.UserDao;
import com.zhuani21.spring.model.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Resource
	private SessionFactory sessionFactory;
	public boolean add(User u) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(u);
		return true;
	}

	public boolean find(String username, String password) {
		System.out.println("UserDaoImpl find runed");
		return false;
	}

}
