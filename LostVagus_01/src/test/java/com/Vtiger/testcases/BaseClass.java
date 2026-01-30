package com.Vtiger.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Vtiger.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	String url =readConfig.getBaseUrl();
	String browser =readConfig.getBrowser();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		switch (browser .toLowerCase()) {
		case  "chrome":
		driver =new ChromeDriver();
		break;
		
		case  "msedge":
			driver =new EdgeDriver();
			break;
		case  "firefox":
			driver =new FirefoxDriver();
			break;
			
			default :
				driver =null;
				break;
		
		}
		
		// implicit wait of 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//for logging
		logger = LogManager.getLogger("LostVagus");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}
