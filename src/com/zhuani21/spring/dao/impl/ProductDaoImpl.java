package com.zhuani21.spring.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.zhuani21.spring.dao.ProductDao;
import com.zhuani21.spring.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(Product p) {
		Session session = sessionFactory.getCurrentSession();
		session.save(p);
	}

	public Product find(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product p = (Product) session.get(Product.class, id);
		System.out.println(p.getProductName());
		p.setProductName("小x果");
		return p;
	}

}
