package com.dal.helper;

import java.sql.*;
import java.lang.*;

public class MyDBConnection {
	static Connection con;

	public static Connection getDbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "syscom", "123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}

	public static void main(String args[]) {

		System.out.println(getDbConnection());
	}
}
