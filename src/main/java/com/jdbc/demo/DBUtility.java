package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	//decalring variable
	private static Connection connection;
	
	static {
		try {
			//intializing variable
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/batch_4", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance() {
		return connection;
	}
	
	

}
