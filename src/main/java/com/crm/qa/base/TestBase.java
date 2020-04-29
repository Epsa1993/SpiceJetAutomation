package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public TestBase(){
		try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Epsa\\Selenium Project-March2020\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(fis);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "D:\\Epsa\\Selenium Project-March2020\\FreeCRM\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
