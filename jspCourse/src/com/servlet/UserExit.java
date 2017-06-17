package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserExit extends HttpServlet implements Servlet {  
    private static final long serialVersionUID = 1L;      
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)         
        throws ServletException, IOException {  
        req.getSession().removeAttribute("userName");     
        resp.sendRedirect("userLogin.jsp");  
    }  
}   
