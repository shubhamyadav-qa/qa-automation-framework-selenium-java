package Important_selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {

		
		  
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        driver.get("https://www.google.com");

		        // Create Explicit Wait
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Wait for search box to be visible
		        WebElement searchBox = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(By.name("q")));

		        searchBox.sendKeys("Selenium WebDriver");

		        // Wait until search button is clickable
		        WebElement searchBtn = wait.until(
		                ExpectedConditions.elementToBeClickable(By.name("btnK")));

		        searchBtn.click();

		        driver.quit();
		    }
		

}
