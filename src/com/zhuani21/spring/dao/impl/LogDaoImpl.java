package com.zhuani21.spring.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhuani21.spring.dao.LogDao;
import com.zhuani21.spring.model.Log;

@Repository("logDao")
public class LogDaoImpl implements LogDao {
	@Resource
	private SessionFactory sessionFactory;

	public void add(Log log) {
		Session session = sessionFactory.getCurrentSession();
		session.save(log);
		//throw new RuntimeException();
	}

}
