package com.briup.gather;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.briup.bean.BIDR;
import com.briup.send.WossModueInit;

public class Gather implements WossModueInit {
	// private String path="src/radwtmp_test";
	private String path;

	@Override
	public void init(Properties properties) {
		path = properties.getProperty("path");
	}

	public Collection<BIDR> gather() {
		List<BIDR> list = new ArrayList<>();
		/**
		 * ����·�����ԡ�/����ͷ���Ӹ�Ŀ¼��ʼ��Windows��Ҫ��//���� ��һ����/"��ʾת���ַ����ڶ���"/"��ʾ��Ŀ¼
		 * ���·��������/��ͷ���ӹ���src��ʼ
		 */
		try {
			// FileReader fr = new
			// FileReader("C:\\Users\\vonym\\Documents\\javaCore\\workspace\\��������\\src\\radwtmp_test");
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			String[] s = null;
			BIDR bidr = null;
			Map<String, BIDR> map = new HashMap<>();
			while ((str = br.readLine()) != null) {
				s = str.split("[|]");
				if ("7".equals(s[2])) {
					bidr = new BIDR();
					bidr.setLogin_name(s[0]);
					bidr.setNAS_IP(s[1]);
					bidr.setLogin_date(new Timestamp(Long.parseLong(s[3]) * 1000));
					bidr.setLogin_ip(s[4]);
					map.put(s[4], bidr);
				} else if ("8".equals(s[2])) {
					bidr = map.get(s[4]);
					bidr.setLogout_date(new Timestamp(Long.parseLong(s[3]) * 1000));
					int time_duration = (int) (bidr.getLogout_date().getTime() - bidr.getLogin_date().getTime());
					bidr.setTime_duration(time_duration);
					list.add(bidr);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
