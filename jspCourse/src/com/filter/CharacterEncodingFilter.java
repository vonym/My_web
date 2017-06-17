package com.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CharacterEncodingFilter implements Filter {

	private String encode = "UTF-8";// 默认UTF-8编码 
	private FilterConfig filterConfig;
	/** 
	 * Constructor of the object. 
	 */
	public CharacterEncodingFilter() {
		super();
	}

	public void init(FilterConfig filterConfig) throws ServletException {  
        String encoding = filterConfig.getInitParameter("encode");  
        if (encoding != null) {  
            encode = encoding;  
        }  
    }  

	 public void doFilter(ServletRequest req, ServletResponse resp,  
	            FilterChain chain) throws IOException, ServletException {  
	        HttpServletRequest request = (HttpServletRequest) req;  
	        HttpServletResponse response = (HttpServletResponse) resp;
	        System.out.println("字符过滤");
	        // 设置request编码  
	        request.setCharacterEncoding(encode);  
	        // 设置相应信息  
	        response.setContentType("text/html;charset=" + encode);  
	        response.setCharacterEncoding(encode);  
	        
	        chain.doFilter(request, response);  
	    }  
	  
	 public void destroy() {  
	  
	   }  
	  

	/** 
	 * Destruction of the servlet. <br> 
	 */
	
}