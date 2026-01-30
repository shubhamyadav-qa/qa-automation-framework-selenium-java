package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_withfactory2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		LoginPage_withfactory  loginPG= new LoginPage_withfactory(driver);
		
		driver.get("http://localhost:8888/index.php?module=Products&action=index");
		loginPG.enterUsername("admin");
		loginPG.enterPassword("admin");
		loginPG.clickOnLoginBtn();
		
		
	}
}
