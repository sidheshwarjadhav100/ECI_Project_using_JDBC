package com.sid.eci.utility;

import java.sql.Connection;
import java.sql.DriverManager;

//this is utility class it has static method that returns connection obj.
public class Utility {

	public static Connection connection() {

		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ecidb";
		String usr = "root";
		String pwd = "root";
		Connection conn = null;

		try {
			Class.forName(path);
			conn = DriverManager.getConnection(url, usr, pwd);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return conn;

	}

}
