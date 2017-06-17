package com.briup.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static String driver;
	private static String url;
	private static String username;
	private static String passwrod;
	private static Properties properties;
	private static Connection connection;
	static {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/com/briup/jdbc/jdbc.properties");
			properties.load(fis);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			passwrod = properties.getProperty("password");
			// System.out.println(driver + url + username + passwrod);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnectio() {
		try {
			Class.forName(driver);
			// 使用两个参数时，此时properties中的用户名key只能是user；
			// DriverManager.getConnection(url,properties);
			connection = DriverManager.getConnection(url, username, passwrod);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
