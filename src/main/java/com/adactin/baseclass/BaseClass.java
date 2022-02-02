package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		
		try {
			
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
			
		}
		else {
			System.out.println("Invalid Browser");
		} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	driver.manage().window().maximize();;
	return driver;
	
}
}