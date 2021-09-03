package com.jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InsertDemo2 {

	public static void main(String[] args) throws SQLException {
		String insertQuery = "insert into sample (name,lab,sampleType) values (?,?,?)";	
		
		//get the connection
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try {
		 conn =DBUtility.getInstance();
		 conn.setAutoCommit(false);
		
		//get the SampleList from sample mock service
		 List<Sample> sampleList =	SampleService.getSampleList();
		  preparedStatement = conn.prepareStatement(insertQuery);
		//get the preparedstatement
		 for(Sample sample :sampleList) {
		preparedStatement.setString(1, sample.getSampleName());
		preparedStatement.setString(2, sample.getLabName());
		preparedStatement.setString(3, sample.getSampleType());
		
		preparedStatement.addBatch();
		 }
		 int numberofops []=preparedStatement.executeBatch();
		 System.out.println(numberofops.length);
		 conn.commit();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			conn.rollback();
		}
		
		finally {
			preparedStatement.close();
			conn.close();
		}

	}

}
