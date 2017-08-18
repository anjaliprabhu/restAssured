package com.home.project.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login {
	
//	@BeforeSuite
//	public void beforTestSuite(){
//		System.out.println("Before Test suite");
//	}
//
//	@BeforeClass
//	public void beforeSuite() {
//		System.out.println("Before Class");
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		System.out.println("After Class");
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Test Suite");
//	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@Test(groups="login")
	public void correctUsernameWrongPassword(){
		System.out.println("2");
		
	}
	

	@Test(groups="login")
	public void correctUsernamePassword() {
		System.out.println("1");
	}
	
	@Test(groups="resetPassword")
	public void resetPassword() {
		System.out.println("resetPassword");
	}
	
	@Test(groups="resetPassword2")
	public void resetPassword2() {
		System.out.println("resetPassword 2 ");
	}
	
	
	
	
}
