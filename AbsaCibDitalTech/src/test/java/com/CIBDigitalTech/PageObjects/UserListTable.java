package com.CIBDigitalTech.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserListTable {
	WebDriver driver;
	
	public UserListTable(WebDriver driverOne){
		driver=driverOne;
		PageFactory.initElements(driverOne, this);
		
		
	}

	@FindBy(xpath="//*[@class='btn btn-link pull-right']")
	WebElement  typeAddUser;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement txtFirstName;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement txtLastName;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement textUserName;
	
	@FindBy(name="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement typeCustomerA;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement typeCustomerB;
	
	@FindBy(xpath="//option[@value='1']")
	WebElement valueRoleAdmin;
	
	@FindBy(xpath="//option[@value='2']")
	WebElement valueRoleCust;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement txtEmail;
	
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement txtCellPhoneNo;
	
	@FindBy(xpath="//button[@ng-click='save(user)']")
	WebElement Save;
	
	public void setUser(String user){
		
		typeAddUser.click();
}
	
	public void setFirstName(String firstName){
			
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName){
		
		txtLastName.sendKeys(lastName);
	}
	
	
	public void setUserName(String userName){
			
		textUserName.sendKeys(userName);
	}
	

	public void setPassword(String password){
		txtPassword.sendKeys(password);
	}
	
	public void setCustomerA(){
		typeCustomerA.click();
	}
	public void setCustomerB(){
		typeCustomerB.click();
	}
	
	public void setRoleAdmin(){
		valueRoleAdmin.click();	
	}
	
	public void setRoleCust(String rolecust){
		valueRoleCust.click();	
	}
	
	public void setEmail(String Email){
		txtEmail.sendKeys(Email);
	}
	
	public void setCellPhone(String phone){
		txtCellPhoneNo.sendKeys(phone);
	}
	public void setSave(){
		Save.click();
	}
	
}
