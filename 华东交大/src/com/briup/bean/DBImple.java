package com.briup.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Properties;

import com.briup.send.WossModueInit;

public class DBImple implements WossModueInit {
	private static Connection connection;
	private static PreparedStatement ps;
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static int batchsize;

	public void dbStroe(List<BIDR> list) throws Exception {
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		// connection = ConnectionFactory.getConnectio();
		connection.setAutoCommit(false);
		int day = 0;
		int count = 0;
		for (BIDR bidr : list) {
			if (day != bidr.getLogin_date().getDate()) {
				day = bidr.getLogin_date().getDate();
				if (ps != null) {
					ps.executeBatch();
					connection.commit();
					ps.close();
				}
				String sql = "insert into t_detail_" + day + "values(?,?,?,?,?,?)";
				ps = connection.prepareStatement(sql);
			}
			ps.setString(1, bidr.getLogin_name());
			ps.addBatch();
			connection.commit();
			count++;
			if (count % batchsize == 0) {
				ps.executeBatch();
				connection.commit();
			}
		}
	}

	@Override
	public void init(Properties properties) {
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		batchsize = Integer.parseInt(properties.getProperty("batchsize"));
	}
}
