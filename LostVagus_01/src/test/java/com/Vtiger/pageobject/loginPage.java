package com.Vtiger.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	
	public loginPage(WebDriver rdriver){
		 driver=rdriver;
		 
		 PageFactory.initElements(rdriver,this);
	}
	
	// identify webElement
	@FindBy(xpath = "//input[@type='text']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement userPassword;
	
	@FindBy(id = "submitButton")
	WebElement submitBtn;
	
	// identify action on WebElement
	public void enterUsername(String name) {
		userName.sendKeys(name);
	}
	
	public void enterUserPassword(String password) {
		userPassword.sendKeys(password);
	}
	
	public void clickOnLogin() { 
		submitBtn.click();;
	}
	
	
}
