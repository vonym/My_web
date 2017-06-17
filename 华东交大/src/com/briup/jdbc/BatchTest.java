package com.briup.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchTest {
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;

	public static void main(String[] args) {
		connection=ConnectionFactory.getConnectio();
		String sql="insert into stu values(?,?,?,?)";
		try {
			preparedStatement=connection.prepareStatement(sql);
			for(int i=0;i<5000;i++) {
				preparedStatement.setInt(1, i);
				preparedStatement.setString(2, "briup"+i);
				preparedStatement.setString(3, "briup"+i);
				preparedStatement.setInt(4, 18);
				preparedStatement.addBatch();
				if (i%5000==0) {
					preparedStatement.executeBatch();
					preparedStatement.clearBatch();
				}
			}
			preparedStatement.executeBatch();
			System.out.println("³É¹¦²åÈë");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
