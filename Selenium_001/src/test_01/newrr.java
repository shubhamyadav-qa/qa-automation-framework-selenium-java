package test_01;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class newrr {
	public static void main (String []args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='p_123/308445']//input[@type='checkbox']")).isSelected();

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        driver.get("https://www.amazon.in/");

		        // Search Laptop
		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);

		        // Apply Brand Filter = HP
		        WebElement hpBrand = wait.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//span[text()='HP']/preceding::input[1]")
		        ));

		        // Checkbox already selected? Then do nothing
		        if (!hpBrand.isSelected()) {
		            hpBrand.click();
		        }

		        // Apply Rating Filter: 4 Stars & Up
		        WebElement rating4plus = wait.until(ExpectedConditions.elementToBeClickable(
		                By.xpath("//section//span[text()='4 Stars & Up']/ancestor::a")
		        ));
		        rating4plus.click();

		        // Verify Filter Label
		        WebElement filterLabel = wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//span[contains(text(),'HP')]")
		        ));

		        System.out.println("Filter Applied: " + filterLabel.getText());

		        
		        driver.quit();
		    }
		}










