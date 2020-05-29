package week_11;

import java.sql.*;
import java.util.Iterator;
import java.util.Scanner;

public class studentDb {

	private static Scanner sc = new Scanner(System.in);;

	private static String DB_URL = "jdbc:mysql://localhost:3306/connectWithJava";
	private static String USER_NAME = "root";
	private static String DB_PASSWORD = "teamlol1";

	public static void main(String[] args) {
		menu();
		sc.close();
	}

	public static void menu() {

		System.out.println("Vui lòng chọn");
		System.out.println("1 : Thêm Sinh Viên");
		System.out.println("2 : Xóa Sinh Vien");
		System.out.println("3 : lấy Dữ Liệu");
		System.out.println("4 : Sửa Tên Sinh Viên");
		System.out.println("5 : Thoát ...");
		boolean flag = true;
		while (flag) {
			int option = sc.nextInt();
			System.out.println(option);
			switch (option) {
			case 1:
				insertTableStudent("INSERT INTO STUDENT VALUES(?,?,?,?,?)");
				break;
			case 2:
				deleteTableStudent("DELETE FROM STUDENT WHERE id = ?");
				break;
			case 3:
				getAllValueStudent("SELECT * FROM STUDENT");
				break;
			case 4:
				updateValueStudent("UPDATE STUDENT SET name = ? WHERE id = ?");
				break;
			default:
				flag = false;
				break;
			}
		}
	}

	private static Connection getConnection(String DB_URL, String USER_NAME, String DB_PASSWORD) {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(DB_URL, USER_NAME, DB_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	private static void insertTableStudent(String query) {
		Connection conn = getConnection(DB_URL, USER_NAME, DB_PASSWORD);
		ResultSet rs = null;
		System.out.println("Nhập tên của bạn");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Nhập điểm 3 môn toán lý hóa");
		float t = sc.nextFloat();
		float l = sc.nextFloat();
		float h = sc.nextFloat();
		int id = 0;
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				id = rs.getInt(1);
			}

			PreparedStatement stm = conn.prepareStatement(query);
			stm.setInt(1, id + 1);
			stm.setString(2, name);
			stm.setFloat(3, t);
			stm.setFloat(4, l);
			stm.setFloat(5, h);
			stm.execute();

			System.out.println("done");

		} catch (SQLException | NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("không thực hiện được câu truy vấn");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void deleteTableStudent(String query) {
		Connection conn = getConnection(DB_URL, USER_NAME, DB_PASSWORD);
		System.out.println("Nhập Mã Sinh viên muốn xóa : ");
		int id = sc.nextInt();
		try {
			PreparedStatement stm = conn.prepareStatement(query);
			stm.setInt(1, id);
			stm.execute();
			System.out.println("done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getAllValueStudent(String query) {
		Connection conn = getConnection(DB_URL, USER_NAME, DB_PASSWORD);
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3) + " " + rs.getFloat(4)
						+ " " + rs.getFloat(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stm.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private static void updateValueStudent(String query) {
		Connection conn = getConnection(DB_URL, USER_NAME, DB_PASSWORD);
		PreparedStatement stm = null;
		System.out.println("Nhập Mã Sinh Viên Muốn đổi");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập tên sinh viên : ");
		String name = sc.nextLine();
		try {
			stm = conn.prepareStatement(query);
			stm.setString(1, name);
			stm.setInt(2, id);
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
