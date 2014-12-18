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

	@Transactional(propagation=Propagation.REQUIRED)
	public void add(Product p) {
		productDao.add(p);
		Log log = new Log();
		log.setMsg("一件产品被保存，产品id：" + p.getId());
		logDao.add(log);
	}

}
