package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.cofig.DbSetup;

@Component
public class Student {
	
	@Autowired // Is use to perform the Dependency Injection by providing the Object of another class
	@Qualifier("oracleSetup")
	DbSetup dbSetup; // HAS-A  // Dependency Injection (DI)
	
	public void saveStudent() {
		System.out.println("Save the Student details");
		System.out.println("Driver : " + dbSetup.getDriver());
		System.out.println("Url : " + dbSetup.getUrl());
		System.out.println("User : " + dbSetup.getUserName());
		System.out.println("Password : " + dbSetup.getPassword());
	}
}
