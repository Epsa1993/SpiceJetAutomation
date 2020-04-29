package spicejettestcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.SpicejetBase;

import spicejetPages.HomePage;
import spicejetPages.RegistrationPage;

public class RegistrationPageTest extends SpicejetBase {
	
	HomePage homepageobj;
	RegistrationPage registrationpageobj;
	
	RegistrationPageTest(){
		
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		homepageobj = new HomePage();
		registrationpageobj = new RegistrationPage();
	}
	
	@Test
	public void getRegistrationTitle(){
		homepageobj.signupDropdown();
		registrationpageobj.getRegistrationTitle();
		registrationpageobj.memberRegistration();
	}
	
}
