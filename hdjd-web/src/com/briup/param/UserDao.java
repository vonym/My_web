package com.briup.param;

public interface UserDao {
	public void saveUser(User user);

	public User findUserByName(String name);
	
}
