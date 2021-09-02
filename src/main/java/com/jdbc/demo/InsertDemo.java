package com.jdbc.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws SQLException {
		
		//get the connection
		
		Connection conn =DBUtility.getInstance();
		
		//get the statement
		
		Statement statement = conn.createStatement();
		
		//execute query using statement
		
		String insertQuery = "insert into employee values (3,'lakshmi','female',200000,'it')";
		
		statement.execute(insertQuery);

	}

}
