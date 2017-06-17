package com.jspCourse.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jspCourse.entity.User;
import com.jspCourse.util.DBConnection;
import com.mysql.jdbc.Connection;

public class UserDao {

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String username = user.getUsername();
		String password = user.getPassword();
		boolean sex = user.isSex();
		String birthday = user.getBirthday();
		String tel = user.getTel();
		boolean bool;
		Statement stmt = null;
		Connection conn = null;
		
		String sql = "INSERT INTO t_user VALUES " + "(null,'"+username+"','"+password+"',"+sex+",'"+birthday+"','"+tel+"')";
	
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			bool = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			bool = false;
			e.printStackTrace();	
		} finally{
			DBConnection.closeStatement(stmt);
			DBConnection.closeConnection(conn);
		} 
		
		return bool;
	}

	public List<User> getAllUserList() {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM t_user";
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				User user = new User();
				user.setUserId(rs.getInt("USERID"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setBirthday(rs.getString("BIRTHDAY"));
				user.setSex(rs.getBoolean("SEX"));
				user.setTel(rs.getString("TEL"));
				
				userList.add(user);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} finally{
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(stmt);
			DBConnection.closeConnection(conn);
		} 
		return userList;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		Integer userId = user.getUserId();
		String username = user.getUsername();
		String password = user.getPassword();
		boolean sex = user.isSex();
		String birthday = user.getBirthday();
		String tel = user.getTel();
		boolean bool;
		Statement stmt = null;
		Connection conn = null;
		
		String sql = "UPDATE t_user SET USERNAME='"+username+"',"
				+ "PASSWORD='"+password+"',SEX="+sex+",BIRTHDAY='"+birthday+"',TEL='"+tel+"'"
				+ "WHERE USERID="+userId+" ORDER BY USERID";
		
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			bool = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			bool = false;
			e.printStackTrace();	
		} finally{
			DBConnection.closeStatement(stmt);
			DBConnection.closeConnection(conn);
		} 
		
		return bool;
	}

	public boolean deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		boolean bool;
		Statement stmt = null;
		Connection conn = null;
		
		String sql = "DELETE FROM t_user WHERE USERID="+userId;
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			bool = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			bool = false;
			e.printStackTrace();	
		} finally{
			DBConnection.closeStatement(stmt);
			DBConnection.closeConnection(conn);
		} 
		return false;
	}

	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM t_user WHERE USERID="+userId;
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		User user = new User();
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				user.setUserId(rs.getInt("USERID"));
				user.setUsername(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setBirthday(rs.getString("BIRTHDAY"));
				user.setSex(rs.getBoolean("SEX"));
				user.setTel(rs.getString("TEL"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} finally{
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(stmt);
			DBConnection.closeConnection(conn);
		}
		return user;
	}

	public boolean loadUser(User user) {
		// TODO Auto-generated method stub
		String username =user.getUsername();
		String password =user.getPassword();
		
		boolean bool = false;
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		String sql = "SELECT * FROM t_user WHERE USERNAME='"+username+"' and PASSWORD='"+password+"'";
		System.out.println(sql);
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				bool=true;
			}else{
				bool=false;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		} finally{
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(stmt);
			DBConnection.closeConnection(conn);
		}
		return bool;
	}

	
}
