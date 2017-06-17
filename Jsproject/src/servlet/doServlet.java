package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connDB.ConnDBClass;

@WebServlet("/doServlet")
public class doServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public doServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("text/html;charset=utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		ConnDBClass conn=new ConnDBClass();
		conn.executDelete("delete from t_root where USER_ID="+id+"");
		conn.executDelete("delete from t_user where USER_ID="+id+"");
		response.sendRedirect("http://localhost:8080/Jsproject/root/root.jsp");
	}

}
