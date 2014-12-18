package com.zhuani21.spring.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.zhuani21.spring.dao.UserDao;
import com.zhuani21.spring.model.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Resource
	private DataSource dataSource;
	public boolean add(User u) {
		try {
			Connection conn = dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values (null,'zhangsan','1234')");
			conn.close();
			System.out.println("insert into user runned");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UserDaoImpl add runed");
		return false;
	}

	public boolean find(String username, String password) {
		System.out.println("UserDaoImpl find runed");
		return false;
	}

}
