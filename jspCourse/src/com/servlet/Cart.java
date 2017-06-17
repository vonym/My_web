package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/buyItem")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
String[] items = { "图书", "化妆品", "衣服" }; // 商品

HttpSession session = req.getSession(); // 获取HttpSession对象
Integer itemCount = (Integer) session.getAttribute("itemCount");// 从Session中获取选择的商品数目
if (itemCount == null) { // 如果无商品则数目为0
	itemCount = new Integer(0);
}

resp.setCharacterEncoding("utf-8"); // 设置响应的编码类型为utf-8
PrintWriter out = resp.getWriter(); // 获取输出对象
String[] itemsSelected = req.getParameterValues("item");// 取得表单上选中的商品
if (itemsSelected != null) {// 判断是否选中商品
	for (int i = 0; i < itemsSelected.length; i++) {
		itemCount = new Integer(itemCount.intValue() + 1);//选中的商品数量
		session.setAttribute("Item" + itemCount, itemsSelected[i]);// 将选中的商品放入会话中
		session.setAttribute("itemCount", itemCount);// 将商品数量放入会话中

	}
}

out.println("<html>");
out.println("<head>");
out.println("<title>购物车</title>");
out.println("</head>");
out.println("<body>");
out.println("<center><h2>购物车</h2></center>");
out.println("<table border=1 align=center bgcolor=#WFFFFF width=250> ");
out.println("<tr>");
out.println("<td align=center>商品名称</td>");
out.println("</tr>");
for (int i = 0; i < itemCount.intValue(); i++) {
	String item = (String) session.getAttribute("Item" + (i+1));
	out.println("<tr>");
	out.println("<td>");			
	out.println(items[Integer.parseInt(item)]);// 输出购物车中的商品
	out.println("</td>");
	out.println("</tr>");
}
out.println("<tr>");
out.println("<td>");
out.println("您购物车中共有"+itemCount+"件商品");
out.println("</td>");
out.println("</tr>");

out.println("</body>");
out.println("</html>");
out.close();//关闭输出对象
}

}
