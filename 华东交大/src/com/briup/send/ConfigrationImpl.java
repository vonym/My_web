package com.briup.send;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.briup.bean.ClientImpl;
import com.briup.bean.DBImple;
import com.briup.bean.ServerImpl;
import com.briup.gather.Gather;

public class ConfigrationImpl implements Configuration {
	private Map<String, WossModueInit> beans;

	public ConfigrationImpl() {
		this("src/src.xml");
	}

	public ConfigrationImpl(String path) {
		// 解析配置文件
		// 读取内容放入到map对象中，按照key为标签名
		// 值为wossModuleInit放置，同时将各自类中
		// 子标签内容放置到properties对象中

		beans = new HashMap<>();
		SAXReader reader = new SAXReader();
		File file = new File(path);
		try {
			Document document = reader.read(file);
			Element element = document.getRootElement();
			List<Element> list = element.elements();
			for (Element e : list) {
				String tagName = e.getName();
				String clsName = e.attributeValue("class");
				WossModueInit cls = (WossModueInit) Class.forName(clsName).newInstance();
				beans.put(tagName, cls);
				Properties properties = new Properties();
				List<Element> list2 = element.elements();
				for (Element element2 : list2) {
					String name = element2.getName();
					String value = element2.getText();
					properties.put(name, value);
				}
				cls.init(properties);
			}
		} catch (DocumentException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public ServerImpl getServer() throws Exception {
		return (ServerImpl) beans.get("server");
	}

	@Override
	public DBImple getDBStore() throws Exception {
		return (DBImple) beans.get("dbstore");
	}

	@Override
	public ClientImpl getClient() throws Exception {
		return (ClientImpl) beans.get("client");
	}

	@Override
	public Gather getGather() throws Exception {
		return (Gather) beans.get("gather");
	}
}