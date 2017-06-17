package com.db;



import java.sql.DriverManager;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.catalina.core.ApplicationContext;

import com.mysql.jdbc.Connection;

public class DBConnection {

	
	
	//通过构造方法加载数据库驱动
    public DBConnection() {
       
    }
    /* 获取数据库连接 */
	public static Connection getDBConnection() {
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jspCourse";
		String user = "root";
		String password = "root";
		
		Connection conn = null;
		try{
			conn = (Connection) DriverManager.getConnection(url,user,password);	
		}catch (SQLException ex) {
		      ex.printStackTrace();
	    }
		
		return conn;
	}
	
	/**
	   * 关闭连接
	   */
	  public static void closeConnection(Connection conn) {
	    try {
	      if (conn != null && !conn.isClosed()) {
	    	  conn.close();
	      }
	    }
	    catch (SQLException e) {
	    }
	  }

	  /**
	   * 关闭语句
	   * @param stmt
	   */
	  public static void closeStatement(Statement stmt) {
	    try {
	      if (stmt != null) {
	        stmt.close();
	      }
	    }
	    catch (SQLException e) {
	    }
	  }

	  /**
	   * 关闭数据集
	   * @param result
	   */
	  public static void closeResultSet(ResultSet result) {
	    try {
	      if (result != null) {
	        result.close();
	      }
	    }
	    catch (Exception e) {
	    }
	  }

}
