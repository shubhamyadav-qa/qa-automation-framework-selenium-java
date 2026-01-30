package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	LoginPage  loginPG= new LoginPage(driver);
	
	driver.get("http://localhost:8888/index.php?module=Products&action=index");
	loginPG.enterUsername("admin");
	loginPG.enterPassword("admin");
	loginPG.clickOnLoginBtn();
	
	
}
}
