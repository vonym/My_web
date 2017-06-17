package com.jspCourse.service;

import java.util.List;

import com.jspCourse.dao.UserDao;
import com.jspCourse.dao.UserDaoNew;
import com.jspCourse.entity.User;

public class UserService {

	//UserDao userDao = new UserDao();
	
	UserDaoNew userDaoNew = new UserDaoNew();
	
	public boolean addUser(User user){
		//boolean bool = userDao.addUser(user);
		boolean bool = userDaoNew.addUser(user);
		return bool;
	}
	public List<User> getAllUserList() {
		// TODO Auto-generated method stub
		//List userList = userDao.getAllUserList();
		List userList = userDaoNew.getAllUserList();
		return userList;
	}
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		//boolean bool = userDao.updateUser(user);
		boolean bool = userDaoNew.updateUser(user);
		return bool;
	}
	public boolean deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		//boolean bool = userDao.deleteUser(userId);
		boolean bool = userDaoNew.deleteUser(userId);
		return bool;
	}
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		//User user = userDao.getUserById(userId);
		User user = userDaoNew.getUserById(userId);
		return user;
	}
	public boolean checkLogin(User user) {
		// TODO Auto-generated method stub
		//boolean bool = userDao.loadUser(user);
		boolean bool = userDaoNew.loadUser(user);
		
		return bool;
	}
	public List<User> getUserListByParam(User user) {
		// TODO Auto-generated method stub
		List userList = userDaoNew.getUserListByParam(user);
		return userList;
		
	}
	

}
