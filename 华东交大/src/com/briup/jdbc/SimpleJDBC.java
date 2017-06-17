package com.briup.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBC {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;

	public static void main(String[] args) {
		connection = ConnectionFactory.getConnectio();
		String sql = "insert int stu values(1,'tom','123',20)";
		String sql2 = "update stu set age=30";
		String sql3 = "select * from stu";
		String sql4 = "delete from stu";

	}

	public static void getInsert(String sql) {
		try {
			statement = connection.createStatement();
			int count = statement.executeUpdate(sql);
			System.out.println("插入:" + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getSelect(String sql) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String password = resultSet.getString("passwd");
				int age = resultSet.getInt("age");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
