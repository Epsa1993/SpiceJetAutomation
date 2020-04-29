package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	HomePage homepageobj;
	LoginPage loginpageobj;
	TestUtil testutilobj;
	ContactsPage contactspageobj;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testutilobj = new TestUtil();
		contactspageobj = new ContactsPage();
		loginpageobj = new LoginPage();
		homepageobj = loginpageobj.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspageobj = homepageobj.clickOnContactLink();
	}
	
	@Test
	public void test() {
		System.out.print("test data");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	
}
