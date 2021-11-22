package com.example.demo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.PooledConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserValidation implements UserValidationInterface{
	@Autowired
	private UserValidationInterface DbConnection;
	@Override
	public boolean validationUser(String username,String password) {
		boolean f  = false;
		try {
			PreparedStatement p1 = ((PreparedStatement) DbConnection).getConnection().prepareStatement("select uid from user where uname = ? and password = ?");
			p1.setString(1, username);
			p1.setString(2, password);
			ResultSet rs = p1.executeQuery();
			if (f==rs.next()) {
				f= true;
			}
		}
		
		catch(Exception e) {
			System.out.println();
			return f;
		}
		return f;
	
	}
	@Override
	public boolean validateUser(String USERNAME, String PASSWORD) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
}
