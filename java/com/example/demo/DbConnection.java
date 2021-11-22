package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	Connection connection;
	
	public  Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExampleJDBC", "root", "admin@123");
		
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
			}
		catch(SQLException e1)
		{
			System.out.println(e1);
			}
		
		return connection;
	}
		
		public  void closeConnection() {
			try 
			{
				if(connection!=null)
				{
					connection.close();
				}
				
			}catch(SQLException e2)
			{
				System.out.println(e2);
				}
			
		
}
}
