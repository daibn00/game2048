package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Constant.Constant;

public class saveDataDB {
	
	
	
	
	public static void insertDataDb(String data, int score) {
		Connection conn = null;
		Statement stm = null;
		PreparedStatement prestm = null;
		
		if(checkData()) {
			System.out.println(data);
			try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 conn = DriverManager.getConnection(Constant.DB_URL, Constant.USER_NAME, Constant.DB_PASSWORD);
				 stm = conn.createStatement();
				 prestm =  conn.prepareStatement("UPDATE broad SET data = ?, score = ? WHERE id = 1");			 
				 prestm.setString(1, data);
				 prestm.setInt(2, score);
				 prestm.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}else {
			try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 conn = DriverManager.getConnection(Constant.DB_URL, Constant.USER_NAME, Constant.DB_PASSWORD);
				 stm = conn.createStatement();
				 prestm =  conn.prepareStatement("INSERT INTO VALUES");			 
				 prestm.setString(1, data);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
		
		
	}
	
	public static String getDataDb() {
		Connection conn = null;
		Statement stm = null;
        ResultSet rs = null;
			try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 conn = DriverManager.getConnection(Constant.DB_URL, Constant.USER_NAME, Constant.DB_PASSWORD);
				 stm = conn.createStatement();
                 rs = stm.executeQuery("SELECT data, score from broad where id = 1");
                 while(rs.next()) {
                	 return rs.getString("data") + rs.getString("score");
                 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			return null;
				
	}
	
	public static boolean checkData() {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 conn = DriverManager.getConnection(Constant.DB_URL, Constant.USER_NAME, Constant.DB_PASSWORD);
			 stm = conn.createStatement();
			 rs = stm.executeQuery("SELECT COUNT(data) as count from broad ");		 
			 while(rs.next()) {
				 if(rs.getInt("count") == 0) {
					 return false;
				 }
			 }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return true;
	}
}
