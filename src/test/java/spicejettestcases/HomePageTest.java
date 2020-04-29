package spicejettestcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.SpicejetBase;

import spicejetPages.HomePage;


public class HomePageTest extends SpicejetBase {
	
	HomePage homepageobj;
	
	public HomePageTest() {
		
	}

	@BeforeTest
	void setUp() {
		initialization();
		homepageobj = new HomePage();
	}
	
	@Test
	public void spicejetTitleTest() {
		String spicejetTitle = homepageobj.spicejetTitle();
		System.out.println("spicejetTitle " + spicejetTitle);
	}
	
    @Test 
	public void spicejetDropdownTest() {
		homepageobj.signupDropdown();
	}
}
