package com.bean;

import java.util.HashMap;
import java.util.Map;

public class IndexMapBean {
	private Map map = new HashMap();

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}
	
	public Object getMap(Object key) {
		return map.get(key);
	}
	void setMap(Object key,Object value) {
		this.map.put(key, value);
	}
	
	
	
}
