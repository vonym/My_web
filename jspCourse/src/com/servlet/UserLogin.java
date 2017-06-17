package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class UserLogin extends HttpServlet {
	 private static final long serialVersionUID = 1L;  
	    
	 protected  void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException{  
	        String userName=req.getParameter("userName");   
	        HttpSession session=req.getSession();  
	        session.setAttribute("userName", userName);   
	        resp.sendRedirect("userIndex.jsp");  
	    }  
}
