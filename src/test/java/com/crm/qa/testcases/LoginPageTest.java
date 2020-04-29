package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpageobj;
	HomePage homepageobj;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	void setUp() {
		initialization();
		loginpageobj = new LoginPage();
	}
	
	@Test(priority = 1)
	public void validateCrmImageTest() {
		boolean flag = loginpageobj.validateCrmImage();
		Assert.assertTrue(flag);	
	}
	
	@Test(priority = 2)
	public void loginPageTitleTest() {
		String title = loginpageobj.loginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority = 3)
	public void loginTest() {
		homepageobj = loginpageobj.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	 @AfterTest 
	 public void tearDown() { 
		 driver.quit();
	}
	 
}
