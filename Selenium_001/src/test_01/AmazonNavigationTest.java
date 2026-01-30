package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavigationTest {

	static  WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://amazon.com");


		Thread.sleep(300);
		if (driver.getTitle().contains("Mobiles")) {
			System.out.println("PASS: Mobiles page verified");
		}

		driver.navigate().back();

		WebElement  todaysDeals=driver.findElement(By.linkText("Today's Deals"));

		// Print inner text
		System.out.println("Inner Text: " + todaysDeals.getText());

		// Click Today’s Deals
		todaysDeals.click();

		// Verify Deals page
		if (driver.getTitle().contains("Deals")) {
			System.out.println("PASS: Today’s Deals page verified");
		} else {
			System.out.println("FAIL: Deals page not opened");
		}

		driver.quit();




	}
}
