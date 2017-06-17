package com.briup.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DiskDom {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File file = new File("src/com/briup/xml/disk.xml");
			Document doc = builder.parse(file);
			NodeList nl = doc.getElementsByTagName("disk");
			//System.out.println(nl.item(0).getAttributes().item(0).getNodeType());
			System.out.println(nl.item(0).getChildNodes().item(1).getChildNodes().item(0).getNodeValue());
			/*for (int i = 0; i < nl.getLength(); i++) {
				Element element=(Element) nl.item(i);
				String id=element.getAttribute("id");
				String size=doc.getElementsByTagName("size").item(i).getFirstChild().getNodeValue();
				String f=doc.getElementsByTagName("file").item(i).getFirstChild().getNodeValue();
				String directory=doc.getElementsByTagName("directory").item(i).getFirstChild().getNodeValue();
				System.out.println(id+"_"+size+"_"+f+"_"+directory);
			}*/
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
