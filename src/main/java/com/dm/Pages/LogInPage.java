package com.dm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.dm.Commons.TestBase;

public class LogInPage extends TestBase {

	@FindBy(how=How.XPATH,using="//input[@id='txtUsername']")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='btnLogin']")
	WebElement loginbtn;
	
	TestBase t=new TestBase();
	
	public LogInPage() {
		PageFactory.initElements(t.driver,this);
	}
	
	
	public void logindata() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
		
	}
	
	
	
	
	
	
}
