package com.jspCourse.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jspCourse.entity.User;
import com.jspCourse.util.DBConnection;
import com.mysql.jdbc.Connection;

public class UserDaoNew {
	
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String username = user.getUsername();
		String password = user.getPassword();
		boolean sex = user.isSex();
		String birthday = user.getBirthday();
		String tel = user.getTel();
		boolean bool = true;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String sql = "INSERT INTO t_user (USERNAME,PASSWORD,SEX,BIRTHDAY,TEL) VALUES (?,?,?,?,?)";
	
		
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setBoolean(3, sex);
			pstmt.setString(4, birthday);
			pstmt.setString(5, tel);
			int flag = pstmt.executeUpdate();
			if(flag==0){bool = false;}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();	
		} finally{
			DBConnection.closePreparedStatement(pstmt);
			DBConnection.closeConnection(conn);
		} 
		
		return bool;
	}

	public List<User> getAllUserList() {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM t_user";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
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
			DBConnection.closeStatement(pstmt);
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
		boolean bool=true;
		PreparedStatement pstmt = null;
		Connection conn = null;
	
		String sql = "UPDATE t_user SET USERNAME=?,PASSWORD=?,SEX=?,BIRTHDAY=?,TEL=?"
				+ "WHERE USERID=? ORDER BY USERID";
		
		try {
			conn = DBConnection.getDBConnection();
	
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setBoolean(3, sex);
			pstmt.setString(4, birthday);
			pstmt.setString(5, tel);
			pstmt.setInt(6, userId);
			int flag = pstmt.executeUpdate();
			if(flag==0){bool = false;}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			bool = false;
			e.printStackTrace();	
		} finally{
			DBConnection.closePreparedStatement(pstmt);
			DBConnection.closeConnection(conn);
		} 
		
		return bool;
	}

	public boolean deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		boolean bool = true;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String sql = "DELETE FROM t_user WHERE USERID=?";
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			int flag = pstmt.executeUpdate();
			if(flag==0){bool = false;}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();	
		} finally{
			DBConnection.closePreparedStatement(pstmt);
			DBConnection.closeConnection(conn);
		} 
		return bool;
	}

	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM t_user WHERE USERID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		User user = new User();
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
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
			DBConnection.closePreparedStatement(pstmt);
			DBConnection.closeConnection(conn);
		}
		return user;
	}

	public boolean loadUser(User user) {
		// TODO Auto-generated method stub
		String username =user.getUsername();
		String password =user.getPassword();
		
		boolean bool = false;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		String sql = "SELECT * FROM t_user WHERE USERNAME=? and PASSWORD=?";
		//System.out.println(sql);
		try {
			conn = DBConnection.getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
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
			DBConnection.closePreparedStatement(pstmt);
			DBConnection.closeConnection(conn);
		}
		return bool;
	}

	public List getUserListByParam(User user) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM t_user WHERE 1=1 ";
		String username = user.getUsername() ;
		boolean sex = user.isSex();
		if(username!=null){		
			sql = sql+"AND USERNAME LIKE '%"+username+"%'";
		}
		if(String.valueOf(sex)!=null){
			sql = sql +"AND SEX="+sex;
		}
		List<User> userList = new ArrayList<User>();
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			conn = DBConnection.getDBConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				User user1 = new User();
				user1.setUserId(rs.getInt("USERID"));
				user1.setUsername(rs.getString("USERNAME"));
				user1.setPassword(rs.getString("PASSWORD"));
				user1.setBirthday(rs.getString("BIRTHDAY"));
				user1.setSex(rs.getBoolean("SEX"));
				user1.setTel(rs.getString("TEL"));
				
				userList.add(user1);
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
}
