package com.jdbc.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {

	public static void main(String[] args) throws SQLException {
		
		
	// get the connection
		Connection connection = null;
		Statement statement = null;
		try {
		 connection = DBUtility.getInstance();
		
		//get the statement from connection
		
		 statement = connection.createStatement();
		
		//execute query
	
		String query = "create table sample (id int NOT NULL AUTO_INCREMENT ,name varchar(255),lab varchar(255),sampleType varchar(255), PRIMARY KEY (id))";
		
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
