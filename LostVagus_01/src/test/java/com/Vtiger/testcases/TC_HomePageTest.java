package com.Vtiger.testcases;

import org.testng.annotations.Test;

import com.Vtiger.pageobject.loginPage;

public class TC_HomePageTest extends BaseClass {

	@Test
	public void verifyLogin() {
		//open url 
		driver.get(url);
		logger.info("url opened");
		
		loginPage pg = new loginPage(driver);
		pg.enterUsername("admin");
		pg.enterUserPassword("admin");
		pg.clickOnLogin();                  
		
	}
}
