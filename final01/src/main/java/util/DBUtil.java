package util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class DBUtil{

	public static Connection getConnection() throws Exception {
		Connection conn = null;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取链接
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/lwl?useUnicode=true&characterEncoding=utf-8","root","");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return conn;
	}

	public static void close(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws Exception {
		System.out.println(getConnection());
	}



	public static Connection  getConnection1() {
		Connection conn = null ;
		try {
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获取链接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LWL/useUnicode=ture&charsetEncodiong=utf-8","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 *  关闭connection
	 * @param conn
	 */
	public static void close1(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
