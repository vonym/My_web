package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerInfo
 */
@WebServlet("/ServerInfo")
public class ServerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		ServletContext servletContext = getServletContext();
		String serverInfo = servletContext.getServerInfo();
		int majorVersion = servletContext.getMajorVersion();
		int minorVersion = servletContext.getMinorVersion();
		
		System.out.println("serverName:"+serverName);
		System.out.println("serverPort:"+serverPort);
		System.out.println("serverInfo:"+serverInfo);
		System.out.println("majorVersion:"+majorVersion);
		System.out.println("minorVersion:"+minorVersion);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
