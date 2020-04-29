package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//form[@id=\"loginForm\"]//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//form[@id=\"loginForm\"]//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//form[@id=\"loginForm\"]//input[@value=\"Login\"]")
	WebElement submit;
	
	@FindBy(xpath="//div[@class=\"navbar-header\"]//img[@class=\"img-responsive\"]")
	WebElement logo;
	
	//initializing page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCrmImage() {
		return logo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();		
		return new HomePage();		
	}
}
