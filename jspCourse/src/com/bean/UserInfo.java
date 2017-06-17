package com.bean;

import java.util.HashMap;
import java.util.Map;

public class UserInfo {
	private String account;
	private String password;
	private String realname;
	private String email;
	private String sex;
	private boolean enbaled;
	private String[] intresting;
	private Map map = new HashMap();
	
	

	public Object getMap(Object key) {
		return map.get(key);
	}

	public void setMap(Object value,Object key) {
		map.put(key, value);
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isEnbaled() {
		return enbaled;
	}

	public void setEnbaled(boolean enbaled) {
		this.enbaled = enbaled;
	}

	public String[] getIntresting() {
		return intresting;
	}

	public void setIntresting(String[] intresting) {
		this.intresting = intresting;
	}

	
	
	

}
