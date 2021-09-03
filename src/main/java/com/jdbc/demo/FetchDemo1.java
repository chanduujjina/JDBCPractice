package com.jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FetchDemo1 {
	
	public static void main(String[] args) throws SQLException {
		     //get the connection
				Connection conn = null;
				PreparedStatement preparedStatement = null;
				try {
					
				String sql = "select * from sample where name =?";
				 conn =DBUtility.getInstance();
				 
				 // get preapre statement
				 preparedStatement = conn.prepareStatement(sql);
				 preparedStatement.setString(1, "test1");
				 //execute query
				 preparedStatement.execute();
				 // get the resultset
				 ResultSet resultSet = preparedStatement.getResultSet();
				 List<Sample> sampleList = new ArrayList();
				 while(resultSet.next()) {
					 Sample sample = new Sample();
					 sample.setId( resultSet.getInt("id"));
					 sample.setSampleName(resultSet.getString("name"));
					 sample.setLabName(resultSet.getString("lab"));
					 sample.setSampleType(resultSet.getString("sampleType"));
					 sampleList.add(sample);
				 }
				 System.out.println(sampleList);
				 
				}catch(Exception ex) {
					ex.printStackTrace();
					
				}
				
				finally {
					preparedStatement.close();
					conn.close();
				}
				
				
	}

}
