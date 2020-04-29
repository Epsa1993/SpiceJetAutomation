package spicejettestcases;

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
		//Assert.assertEquals(spicejetTitle, "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", "title matches");
	}
	
    @Test 
	public void spicejetDropdownTest() throws InterruptedException {
		homepageobj.signupDropdown();
		}
	
	/*
	 * @Test public void AddOns() { homepageobj.AddOns(); }
	 */
	 
	
}
