package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientInfo
 */
@WebServlet("/ClientInfo")
public class ClientInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("GBK");                  //设置响应的编码类型为GBK
		PrintWriter out=resp.getWriter();                  //获取输出对象
		out.println("<html>");		
		out.println("<head>");		
		out.println("<title>客户端信息</title>");		
		out.println("</head>");		
		out.println("<body>");				
		out.println("<center><h2>客户端信息列表</h2></center>");
		out.println("<table border=1> ");	
		out.println("<tr>");
		out.println("<td>客户端主机名</td>");
		out.println("<td>"+req.getRemoteHost()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>客户端IP地址</td>");
		out.println("<td>"+req.getRemoteAddr()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>客户端端口号</td>");
		out.println("<td>"+req.getRemotePort()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>请求方式</td>");
		out.println("<td>"+req.getMethod()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>请求协议</td>");
		out.println("<td>"+req.getProtocol()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>编码格式</td>");
		out.println("<td>"+req.getCharacterEncoding()+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>请求的参数名与参数值</td>");
		out.println("<td>");
		Enumeration em=req.getParameterNames();             //获取请求的所有参数名称
		while(em.hasMoreElements()){
			String praramName=(String)em.nextElement();     //获取每一个参数名称
			String praramValue=req.getParameter(praramName);//获取参数指
			out.println(praramName+"="+praramValue);		
		}
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");	
		out.println("</body>");		
		out.println("</html>");		
		out.close();//关闭输出对象
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
