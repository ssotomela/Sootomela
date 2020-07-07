package com.CIBDigitalTech.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.CIBDigitalTech.Utilities.ReadFile;

public class BaseUserList {
	
	ReadFile readfile=new ReadFile();
	
	public String baseURL ="http://www.way2automation.com/angularjs-protractor/webtables/";;
	public static WebDriver driver;
	public static String User;
	public static String firstName="FName1";
	public static String lastName="LName1";
	public static String userName="User1";
	public static String password= "Pass1";
	public static String CustomerA="CompanyAAA";
	public static String RoleAdmin="Admin";
	public static String RoleCust="";
	public static String Email="Admin@Mail.com";
	public static String phone="082555";
	
	@BeforeClass
	public void setup(){
		
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:/Selenium/utils/chrome/chromedriver_win.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown(){
		//driver.quit();
		
	}

}
