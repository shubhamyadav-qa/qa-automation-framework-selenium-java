package testng_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testng_demo {
	@Test
	
     public void VerifyPageTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String expectedTitle = "Google";
		String   actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	
	}
}
