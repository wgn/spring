package com.zhuani21.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhuani21.spring.dao.LogDao;
import com.zhuani21.spring.dao.ProductDao;
import com.zhuani21.spring.model.Log;
import com.zhuani21.spring.model.Product;
import com.zhuani21.spring.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	private LogDao logDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	@Resource
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	@Resource
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Transactional
	public void add(Product p) {
		productDao.add(p);
		Log log = new Log();
		log.setMsg("一件产品被保存，产品id：" + p.getId());
		logDao.add(log);
	}
	@Transactional(readOnly=true)
	public Product find(int id){
		Product p = productDao.find(id);
		System.out.println(p.getProductName());
		return p;
	}
	//这两个没有注解的方法都会报错，因为dao中使用了getCurrentSession，而内部调用没有启动事务
	//导致session没有创建，因为内部调用将导致AOP失效，所以事务也就是失效了。
	//比如，AOP拦截所有service的方法，那么调用这个类的时候，AOP的代码走一遍，但是这个类再调用内部的其他方法，则AOP不会再执行。
	public void save(Product p){
		this.add(p);
	}
	public Product get(int id){
		return this.find(id);
	}

}
