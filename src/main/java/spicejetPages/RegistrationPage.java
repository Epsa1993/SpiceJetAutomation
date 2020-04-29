package spicejetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.SpicejetBase;

public class RegistrationPage extends SpicejetBase {
	
	WebElement title = driver.findElement(By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']"));
	
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getRegistrationTitle() {
		
		String registrationTitle =  driver.getTitle();
		System.out.println("registrationTitle " + registrationTitle);
		return registrationTitle;
	}
	
	public void memberRegistration() {
		Select selecttitle = new Select(title);
		selecttitle.selectByIndex(2);
	}
}
