package com.briup.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeeSax {
	public static void main(String[] args) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			File file = new File("src/com/briup/xml/employee.xml");
			EmployeeHandler eh = new EmployeeHandler();
			parser.parse(file, eh);
			List<Employee> list = eh.getList();
			for (Employee employee : list) {
				System.out.println(employee);
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class EmployeeHandler extends DefaultHandler {
	private List<Employee> list;
	private String tagName;
	private Employee employee;

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length);
		if ("name".equals(tagName)) {
			employee.setName(str);
		} else if ("age".equals(tagName)) {
			employee.setAge(Integer.parseInt(str));
		} else if ("gender".equals(tagName)) {
			employee.setGender(str);
		} else if ("salary".equals(tagName)) {
			employee.setSalary(Integer.parseInt(str));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if ("employee".equals(qName)) {
			list.add(employee);
		} else {
			tagName = null;
		}
	}

	@Override
	public void startDocument() throws SAXException {
		list = new ArrayList<>();

	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if ("employee".equals(qName)) {
			employee = new Employee();
			employee.setId(Integer.parseInt(attributes.getValue("id")));
			employee.setDepName(attributes.getValue("depName"));
		} else {
			tagName = qName;
		}
	}
}