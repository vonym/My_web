package com.dao;

import com.po.User;

public class UserDao {
	public Boolean LoginDao(User user) {
		if ("feng".equals(user.getName()) && "123".equals(user.getPassword())) {
			return true;

		} else {
			return false;
		}
	}
}
