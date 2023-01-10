package com.dm.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.dm.Commons.TestBase;
import com.dm.Pages.LogInPage;

public class LogInTest extends TestBase {

	LogInPage login=new LogInPage();
	
//	public static LogInTest() {
//		super();
//	}
	//TestBase t=new TestBase();
	
	
	@Test
	public void loginset() {
		//login.openbrowser();
		//openbrowser();
		
		//openbrowser();
		
		login.logindata();
		
		System.out.println("log in is successfull");
		
		
		
		
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.close();
//	}
}
