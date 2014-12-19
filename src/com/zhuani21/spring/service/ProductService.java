package com.zhuani21.spring.service;

import com.zhuani21.spring.model.Product;

public interface ProductService {
	void add(Product p);

	Product find(int i);

	void save(Product p);

	Product get(int i);
}
