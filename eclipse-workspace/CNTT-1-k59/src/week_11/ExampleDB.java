package week_11;

import java.sql.*;


public class ExampleDB {
	public static String nameDriver = "com.mysql.cj.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://localhost:3306/connectWithJava";
	private static String USER_NAME = "root";
	private static String DB_PASSWORD = "teamlol1";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stm = null;
		
			
			try {
				Class.forName(nameDriver);
				conn = DriverManager.getConnection(DB_URL, USER_NAME, DB_PASSWORD);
				stm = conn.createStatement();
				
				String sql = "Select * from student";
				 ResultSet result = stm.executeQuery(sql);
				while(result.next()) {
					int id = result.getInt(1);
					
					System.out.println(id);
					
				}
				
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					conn.close();
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(conn.toString());
			
			
		} 
	}


