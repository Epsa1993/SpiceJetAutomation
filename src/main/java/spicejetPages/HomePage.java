package spicejetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.SpicejetBase;

public class HomePage extends SpicejetBase {
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	@FindBy(xpath="//div[@id=\"header\"]//div[@id=\"smoothmenu1\"]//a[contains(text(), \"Login / Signup\")]")
	WebElement loginsignup;
	
	@FindBy(xpath="//a[text()=\"Laptops & Notebooks\"]")
	WebElement Laptop;
	
	@FindBy(xpath="//a[text()=\"SpiceClub Members\"]")
	WebElement spiceclub;
	
	@FindBy(xpath="//a[text()=\"Add-Ons\"]")
	WebElement AddOns;
	
	@FindBy(xpath="SpiceMax")
	WebElement max;
	
	WebElement title = driver.findElement(By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']"));
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String spicejetTitle() {
		return driver.getTitle();
	}
	 
	
	  public void signupDropdown() {
	  
	  WebElement remote= driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
	  
	  WebElement spiceclub = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
	  
	  WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
	  
	  Actions action = new Actions(driver); //Thread.sleep(20000);
	  action.moveToElement(remote).build().perform();
	  action.moveToElement(spiceclub).build().perform(); signup.click();
	  action.moveToElement(signup).click().build().perform(); 
	  }	 
	  
}
