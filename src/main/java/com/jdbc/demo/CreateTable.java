package com.jdbc.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		
		
	// get the connection
		Connection connection = null;
		Statement statement = null;
		try {
		 connection = DBUtility.getInstance();
		
		//get the statement from connection
		
		 statement = connection.createStatement();
		
		//execute query
	
		String query = "create table employee (id int NOT NULL AUTO_INCREMENT,name varchar(255),gender varchar(255),salary int,dept varchar(255),PRIMARY KEY (id))";
		
		boolean value =statement.execute(query);
		
		System.out.println(value);
	}catch (SQLException ex) {
		ex.printStackTrace();
	}
	finally {
		statement.close();
		connection.close();
	}

	}

}
