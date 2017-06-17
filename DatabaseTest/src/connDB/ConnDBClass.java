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
			System.out.println("���ӳɹ�");
		} catch (Exception e) {
			System.out.println("���ݿ�����ʧ�ܡ�����");
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
	public ResultSet executQuery(String sql){ //��ѯ
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
	public boolean executUpdate(String sql){	//��
		if (conn==null) {
			creatConnetion();
		}
		Statement statement;
		try {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
			System.out.println("�����ɹ�");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean executInsert(String sql){	//����
		if (conn==null) {
			creatConnetion();
		}
		try {
			Statement statement=conn.createStatement();
			boolean bool=statement.execute(sql);
			System.out.println(sql);
			if (bool) {
				System.out.println("�������ݳɹ�");
				return true;
			}else {
				System.out.println("��������ʧ��");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean executDelete(String sql){	//ɾ��
		if (conn==null) {
			creatConnetion();
		}
		try {
			System.out.println(sql);
			Statement statement=conn.createStatement();
			boolean bool=statement.execute(sql);
			if (bool) {
				System.out.println("ɾ�����ݳɹ�");
				return true;
			}else {
				System.out.println("ɾ������ʧ��");
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
