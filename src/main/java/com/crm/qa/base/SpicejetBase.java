package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class SpicejetBase {
	
	public static WebDriver driver;
	
	public static Properties props;
	
	 public SpicejetBase(){
		try {
		props = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Epsa\\Selenium Project-March2020\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\configSpicejet.properties");
		props.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		String BrowserName = props.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}
	
}
