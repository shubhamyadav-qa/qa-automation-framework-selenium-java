package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Class  {
	
	     

	public  void login(WebDriver driver) throws InterruptedException {
	driver =new ChromeDriver();
	driver.get("http://localhost:8888/");
	List <WebElement> userlogin=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
	Thread.sleep(2000);
	  userlogin.get(0).sendKeys("admin");
	  userlogin.get(1).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	  
	}

	
	
}
