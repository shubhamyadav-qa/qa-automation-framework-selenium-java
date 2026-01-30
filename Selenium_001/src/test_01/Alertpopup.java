package test_01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	static WebDriver driver;
public static void main(String[] args) {
	
	 driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("school");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Alert alert=driver.switchTo().alert();
	String lert=alert.getText();
	System.out.println(lert);
	alert.accept();
	

}
}
