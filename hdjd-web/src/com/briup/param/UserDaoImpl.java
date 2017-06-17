package com.briup.param;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.briup.jdbc.ConnectionFactory;

public class UserDaoImpl implements UserDao {
	private static Connection conn;
	static {
		conn=ConnectionFactory.getConnectio();
	}

	@Override
	public void saveUser(User user) {
		String sql = "insert into u values(seq.nextval,?,?,?,?)";
		PreparedStatement statement = null;
		try {
			statement = conn.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getGender());
			statement.setString(3, user.getPassword());
			statement.setString(4, user.getHobby());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User findUserByName(String name) {
		User user = null;
		try {
			Statement statement = conn.createStatement();
			String sql = "select * from u where name='"+name+"'";
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				user = new User();
				user.setName(set.getString("name"));
				user.setGender(set.getString("gender"));
				user.setPassword(set.getString("password"));
				user.setHobby(set.getString("hobby"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
