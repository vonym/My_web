import java.sql.Connection;
import java.sql.DriverManager;


public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://localhost:3306/test";
		String driver="org.gjt.mm.mysql.Driver";
		String userName="root";
		String userPWS="";
		try {
			Class.forName(driver);
			Connection connection=DriverManager.getConnection(dbURL,userName,userPWS);
			System.out.println("连接成功");
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败");
		}
	}

}
