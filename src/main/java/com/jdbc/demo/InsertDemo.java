package com.jdbc.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws SQLException {
		
		//get the connection
		Connection conn = null;
		Statement statement = null;
		try {
		 conn =DBUtility.getInstance();
		
		//get the statement
		
		 statement = conn.createStatement();
		
		//execute query using statement
		
		String insertQuery = "insert into employee (name,gender,salary,dept) values ('divya','female',300000,'it')";
		
		statement.execute(insertQuery);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		finally {
			statement.close();
			conn.close();
		}

	}

}
