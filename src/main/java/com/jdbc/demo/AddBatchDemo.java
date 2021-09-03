package com.jdbc.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatchDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection =  null;
		 PreparedStatement preparedStatement = null;
		try {
			 connection = DBUtility.getInstance();
			 connection.setAutoCommit(false);
			 
			 String insertsql = "insert into sample (name,lab,sampleType) values (?,?,?)";
			 preparedStatement = connection.prepareStatement(insertsql);
			 //record 1
			 preparedStatement.setString(1, "test3");
			 preparedStatement.setString(2, "vasavi clinic");
			 preparedStatement.setString(3, "chemo");
			  //record 2
			 String deleteSQL ="delete from sample where name='test3'";
			 
			 preparedStatement.addBatch(deleteSQL);
			 
			 preparedStatement.executeBatch();
			 connection.commit();
			
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			connection.rollback();
			e.printStackTrace();
		}
		
		finally {
			preparedStatement.close();
			connection.close();
		}

	}

}
