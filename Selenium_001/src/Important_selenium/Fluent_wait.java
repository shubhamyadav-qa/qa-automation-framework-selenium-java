package Important_selenium;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class Fluent_wait {

	public static void main(String[] args) {
	

		

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://www.google.com");

		        // Create Fluent Wait
		        Wait<WebDriver> wait = new FluentWait<>(driver)
		                .withTimeout(Duration.ofSeconds(20))        // max 20 sec
		                .pollingEvery(Duration.ofSeconds(2))        // check every 2 sec
		                .ignoring(NoSuchElementException.class);    // ignore this error

		        // 1️⃣ Wait for presence of element
		        WebElement searchBox = wait.until(
		                ExpectedConditions.presenceOfElementLocated(By.name("q"))
		        );
		        searchBox.sendKeys("Selenium WebDriver");

		        // 2️⃣ Wait for visibility of element
		        WebElement searchVisible = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(By.name("q"))
		        );

		        // 3️⃣ Wait for element to be clickable
		        WebElement searchBtn = wait.until(
		                ExpectedConditions.elementToBeClickable(By.name("btnK"))
		        );
		        searchBtn.click();

		        // 4️⃣ Custom condition (example)
		        WebElement resultStats = wait.until(driver1 -> 
		                driver1.findElement(By.id("result-stats"))
		        );

		        System.out.println("Search Completed. Result Stats: " + resultStats.getText());

		        driver.quit();
		    }
		}


