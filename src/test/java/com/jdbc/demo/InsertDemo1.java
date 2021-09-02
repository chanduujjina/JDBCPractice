package com.jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo1 {

	public static void main(String[] args) throws SQLException {
		String insertQuery = "insert into employee values (?,?,?,?,?)";	
		
		//get the connection
		
		Connection conn =DBUtility.getInstance();
		
		//get the preparedstatement
		
		PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
		
		preparedStatement.setInt(1, 4);
		preparedStatement.setString(2, "divya");
		preparedStatement.setString(3, "female");
		preparedStatement.setInt(4, 100000);
		preparedStatement.setString(5, "it");
		//preparedStatement.execute();
		
		//execute the query
		
		boolean value = preparedStatement.execute();
		
		System.out.println(value);

	}

}
