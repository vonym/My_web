package com.feng.chouxianggongchang;

import java.util.Properties;

public class SQL {
	public void create() {
		try {
			Properties properties = new Properties();
			properties.load(SQL.class.getResourceAsStream("db.properties"));
			String value = properties.getProperty("db");
			System.out.println(value);
			WinStyle winStyle = (WinStyle) Class.forName(value).newInstance();
			winStyle.info();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
