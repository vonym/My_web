package com.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class IPFilter implements Filter {

	/** 
	 * Constructor of the object. 
	 */
	public IPFilter() {
		super();
	}

	private FilterConfig filterConfig;
	private String filterIp;

	// Handle the passed-in FilterConfig      
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		filterIp = filterConfig.getInitParameter("filterIp");
		if(filterIp==null)
			filterIp = "";
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filterChain)

	{
		try {
			/*HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) res;
			HttpSession session = request.getSession();
*/
			// 这里放到达目的地前(进入)处理代码  
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("error.jsp");
			String remoteIp = req.getRemoteAddr();
			if(remoteIp.equals(filterIp)){
				requestDispatcher.forward(req, res);
			}else{
				filterChain.doFilter(req, res);
			}
			

			// 这里放到达目的地(离开)的处理代码  

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * Destruction of the servlet. <br> 
	 */
	public void destroy() {
		// Just puts "destroy" string in log  
		// Put your code here  
		this.filterConfig = null;
	}

}