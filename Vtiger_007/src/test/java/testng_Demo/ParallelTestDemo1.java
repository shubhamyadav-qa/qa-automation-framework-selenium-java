package testng_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo1 {
    WebDriver driver;
	
    
    @Test
    public void verifyTitle() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(),"GOOGLE");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
    
    
    @Test
    public void verifyLogo() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement logo=driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']"));
		Assert.assertTrue(logo.isDisplayed());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
