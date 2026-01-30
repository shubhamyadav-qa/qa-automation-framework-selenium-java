package Important_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
	
		
		        ChromeDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();

		        // Implicit Wait
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        driver.get("https://www.google.com");

		        // Element will be found even if it takes time
		        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");

		        driver.findElement(By.name("btnK")).click();

		        driver.quit();
		    }
		}

	