package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class testUser {
@Autowired
UserValidationInterface DefaultUserValidation;
public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(testUser.class);
	UserValidationInterface g = (UserValidationInterface) ctx.getBean("DefaultUserValidation");
	boolean f = g.validateUser("Meghana" , "Maggi@123");
	System.out.println(g.validateUser("Meghana", "Maggi123"));
	if (f == true) {
		System.out.println("Login successful");
		
	}
	else
		System.out.println("Login UnSuccessful");
}
}
