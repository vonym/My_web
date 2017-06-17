package connDB;
import java.sql.*;

public class ConnDBClass {
	private String user="root";
	private String password="";
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/studentinfo";
	private Connection conn;
	public ConnDBClass(){
		try {
			Class.forName(driver).newInstance();
			System.out.println("连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败。。。");
		}
	}
	public boolean creatConnetion(){
		try {
			conn=DriverManager.getConnection(url,user,password);
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	public ResultSet executQuery(String sql){ //查询
		ResultSet resultSet = null;
		if (conn==null) {
			creatConnetion();
		}
		try {
			Statement statement=conn.createStatement();
			resultSet=statement.executeQuery(sql);
			return resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	public boolean executUpdate(String sql){	//改
		if (conn==null) {
			creatConnetion();
		}
		Statement statement;
		try {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
			System.out.println("操作成功");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean executInsert(String sql){	//插入
		if (conn==null) {
			creatConnetion();
		}
		try {
			Statement statement=conn.createStatement();
			boolean bool=statement.execute(sql);
			System.out.println(sql);
			if (bool) {
				System.out.println("插入数据成功");
				return true;
			}else {
				System.out.println("插入数据失败");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean executDelete(String sql){	//删除
		if (conn==null) {
			creatConnetion();
		}
		try {
			System.out.println(sql);
			Statement statement=conn.createStatement();
			boolean bool=statement.execute(sql);
			if (bool) {
				System.out.println("删除数据成功");
				return true;
			}else {
				System.out.println("删除数据失败");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void closeConnetion(){
		if (conn==null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ConnDBClass connDBClass=new ConnDBClass();
		ResultSet resultSet=connDBClass.executQuery("select * from studentinfo");
		try {
			while(resultSet.next()){
				System.out.print(resultSet.getInt(1));
				System.out.print(resultSet.getString(2));
				System.out.print(resultSet.getString(3));
				System.out.print(resultSet.getString(4));
				System.out.print(resultSet.getString(5));
				System.out.print(resultSet.getString(6));
				System.out.println("\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
