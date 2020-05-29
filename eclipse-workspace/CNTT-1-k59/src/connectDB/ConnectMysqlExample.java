package connectDB;

import java.sql.*;

public class ConnectMysqlExample {
	
	private static String DB_URL = "jdbc:mysql://localhost:3306/connectWithJava";
	private static String USER_NAME = "root";
	private static String DB_PASSWORD = "teamlol1";
	
	public static void main(String[] args) {
		try {
			Connection conn = getConnection(DB_URL,USER_NAME,DB_PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(String dbUrl,String useName,String password) {
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection(dbUrl, useName, password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connect Faild");
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
