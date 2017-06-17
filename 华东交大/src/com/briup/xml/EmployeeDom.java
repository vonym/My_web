package com.briup.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EmployeeDom {
	private static List<Employee> list = new ArrayList<>();
	private static Employee employee;

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File file = new File("src/com/briup/xml/employee.xml");
			Document document = builder.parse(file);
			NodeList nl = document.getElementsByTagName("employee");
			for (int i = 0; i < nl.getLength(); i++) {
				employee = new Employee();
				Element element = (Element) nl.item(i);
				int id = Integer.parseInt(element.getAttribute("id"));
				String depName = element.getAttribute("depName");
				employee.setId(id);
				employee.setDepName(depName);
				NodeList nl2 = nl.item(i).getChildNodes();
				for (int j = 0; j < nl2.getLength(); j++) {
					if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {
						String nodeName = nl2.item(j).getNodeName();
						String nodeValue = nl2.item(j).getFirstChild().getNodeValue();
						if ("name".equals(nodeName)) {
							employee.setName(nodeValue);
						} else if ("age".equals(nodeName)) {
							employee.setAge(Integer.parseInt(nodeValue));
						}else if ("gender".equals(nodeName)) {
							employee.setGender(nodeValue);
						}else if ("salary".equals(nodeName)) {
							employee.setSalary(Integer.parseInt(nodeValue));
						}
					}
				}
				list.add(employee);
			}
			for (Employee e : list) {
				System.out.println(e);
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
