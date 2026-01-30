package test_01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 {
	public static void main (String []args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://amazon.com");
		Thread.sleep(500);
		WebElement continuebutton=   driver.findElement(By.xpath("//button[@class='a-button-text']"));
		continuebutton.click();
		Alert aler=driver.switchTo().alert();
		aler.dismiss();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		WebElement search_product=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_product.sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


	}

}
