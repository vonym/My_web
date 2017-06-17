package com.briup.day15.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLTest {
	public static void main(String[] args) {
		URL url = null;
		URLConnection conn = null;
		Scanner sc = null;
		try {
			url = new URL("http://localhost:8888/test");
			conn = url.openConnection();
			sc = new Scanner(conn.getInputStream());
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(sc!=null){
				sc.close();
			}
		}
	}
}