package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	//This class run in LoginTest
	// using without page Factory
	WebDriver driver;
	
	LoginPage(WebDriver d){
		driver =d;
	}
	
	By  username = By.xpath("//input[@name='user_name']");
	By  password = By.xpath("//input[@type='password']");
	By  loginBtn = By.xpath("//input[@id='submitButton']");
	
	public void enterUsername(String usnmae) {
		driver.findElement(username).sendKeys(usnmae);
	}
	
	public void enterPassword(String passwd) {
		driver.findElement(password).sendKeys(passwd);
	}
	public void clickOnLoginBtn () {
		driver.findElement(loginBtn).click();
	}
}
