package com.jdbc.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {

	public static void main(String[] args) throws SQLException {
		
		
	// get the connection
		
		Connection connection = DBUtility.getInstance();
		
		//get the statement from connection
		
		Statement statement = connection.createStatement();
		
		//execute query
	
		String query = "create table sample (id int,name varchar(255),lab varchar(255),sampleType varchar(255))";
		
		boolean value =statement.execute(query);
		
		System.out.println(value);

	}

}
