package com.dm.Commons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public void openbrowser() {

	WebDriverManager.chromedriver().setup();
	
	 driver=new ChromeDriver();
	 
	// driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
