package com.CIBDigitalTech.TestCases;

import org.testng.annotations.Test;

import com.CIBDigitalTech.PageObjects.UserListTable;

public class UserList extends BaseUserList {
	
	@Test
	public void userList(){
		driver.get(baseURL);
		UserListTable lt=new UserListTable(driver);
		lt.setUser(User);
		lt.setFirstName(firstName);
		lt.setLastName(lastName);
		lt.setUserName(userName);
		lt.setPassword(password);
		lt.setCustomerA();
		lt.setRoleAdmin();
		lt.setEmail(Email);
		lt.setCellPhone(phone);
		lt.setSave();
	}

}
