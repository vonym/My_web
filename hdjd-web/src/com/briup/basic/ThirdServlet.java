package com.briup.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//servlet的根路径：工程的根路径127.0.0.1：8888/hdjd-web/
//@WebServlet("/servlet/thirdServlet")
@WebServlet(name = "ThirdServlet", urlPatterns = { "/servlet/thirdServlet", "/servlet/thirdServlet.do" }, initParams = {
		@WebInitParam(name = "verison", value = "1.0"), @WebInitParam(name = "author", value = "jack") },loadOnStartup=0)
public class ThirdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is doGet方法");
		resp.setContentType("image/jpeg;charset=utf-8");
		File file = new File("/hdjd-web/WebContent/img/a.jpeg");
		System.out.println(file.getAbsolutePath());
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
		byte[] b = new byte[1024];
		int count = 0;
		while ((count = bis.read()) != -1) {
			bos.write(b, 0, count);
		}
		bos.flush();
		bos.close();
		bis.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is doPost方法");
		doGet(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("thirdServlet--->init");
		Enumeration<String> enu = config.getInitParameterNames();
		while (enu.hasMoreElements()) {
			String name = enu.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + "     " + value);
		}
	}

}
