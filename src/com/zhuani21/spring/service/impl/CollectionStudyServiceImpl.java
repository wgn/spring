package com.zhuani21.spring.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.zhuani21.spring.service.CollectionStudyService;

public class CollectionStudyServiceImpl implements CollectionStudyService {

	private Properties properties;
	private List<Object> list;
	private Set<Object> set;
	private Map<String, Object> map;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void p() {

		for (Entry<Object, Object> entry : properties.entrySet()) {
			System.out.println("properties key:" + entry.getKey() + " value:"
					+ entry.getValue());
		}

		for (Object s : list) {
			System.out.println("list:" + s);
		}

		for (Object s : set) {
			System.out.println("set:" + s);
		}

		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println("map key:" + entry.getKey() + " value:"
					+ entry.getValue());
		}

	}

}
