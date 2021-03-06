package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	HomePage homepageobj;
	LoginPage loginpageobj;
	TestUtil testutilobj;
	ContactsPage contactspageobj;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testutilobj = new TestUtil();
		contactspageobj = new ContactsPage();
		loginpageobj = new LoginPage();
		homepageobj = loginpageobj.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepageobj.verifyhomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO", "Home Page Title is not matched");
	}
	
	@Test(priority = 2)
	public void verifyUserNameTest() {
		 testutilobj.switchToFrame();
		Assert.assertTrue(homepageobj.verifyUserName(), "No Username Found");
	}
	
	@Test(priority = 3)
	public void clickOnContactLinkTest() {
		driver.switchTo().frame("mainpanel");
		contactspageobj = homepageobj.clickOnContactLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	
}
