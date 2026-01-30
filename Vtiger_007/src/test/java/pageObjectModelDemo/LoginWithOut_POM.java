package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithOut_POM {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/index.php?module=Products&action=index");
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
}
}
