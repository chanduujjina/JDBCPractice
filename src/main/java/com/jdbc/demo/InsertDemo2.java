package com.jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InsertDemo2 {

	public static void main(String[] args) throws SQLException {
		String insertQuery = "insert into sample values (?,?,?,?)";	
		
		//get the connection
		
		Connection conn =DBUtility.getInstance();
		
		//get the SampleList from sample mock service
		 List<Sample> sampleList =	SampleService.getSampleList();
		
		//get the preparedstatement
		 for(Sample sample :sampleList) {
		
		PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
		
		preparedStatement.setInt(1, sample.getId());
		preparedStatement.setString(2, sample.getSampleName());
		preparedStatement.setString(3, sample.getLabName());
		preparedStatement.setString(4, sample.getSampleType());
		
		//preparedStatement.execute();
		
		//execute the query
		
		boolean value = preparedStatement.execute();
		
		System.out.println(value);
		 }

	}

}
