package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// using page factory
public class LoginPage_withfactory {
  // this class will run with LoginPage_withfactory2
	WebDriver driver;
	LoginPage_withfactory(WebDriver d){
		driver=d;
		
		// that method will create web Element 
		PageFactory.initElements(driver, this);
	}
	
	//identify web Elements
	// indentify user name 
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	WebElement loginBtn;
	
	
	public void enterUsername(String usname) {
		username.sendKeys(usname);
	}
	
	public void enterPassword(String passwd) {
		password.sendKeys(passwd);
	}
	public void clickOnLoginBtn () {
		loginBtn.click();
	}
}
