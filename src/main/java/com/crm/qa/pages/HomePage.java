package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[@class=\"headertext\"][contains(text(), 'User: Demo User' )]")
	WebElement username;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(), 'Deals')]")
	WebElement deals;
	
	@FindBy(xpath="//a[contains(text(), 'Tasks')]")
	WebElement tasks;
	
	public HomePage() {
		super();
	}
	
	public String verifyhomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserName() {
		return username.isDisplayed();
	}
	
	public ContactsPage clickOnContactLink() {
		contacts.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsPage() {
		deals.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksPage() {
		tasks.click();
		return new TasksPage();
	}
}
