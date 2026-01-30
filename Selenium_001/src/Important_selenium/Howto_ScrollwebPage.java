package Important_selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howto_ScrollwebPage {

	public static void main(String[] args) throws InterruptedException {
	
		
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.selenium.dev/");

		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // 1️⃣ Scroll by Pixel (Up/Down)
		        js.executeScript("window.scrollBy(0,400);");   // scroll down
		        Thread.sleep(1000);
		        js.executeScript("window.scrollBy(0,-300);");  // scroll up
		        Thread.sleep(1000);

		        // 2️⃣ Scroll to Bottom of Page
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		        Thread.sleep(1000);

		        // 3️⃣ Scroll to Top of Page
		        js.executeScript("window.scrollTo(0, 0);");
		        Thread.sleep(1000);

		        // 4️⃣ Scroll to a Particular Element
		        WebElement element = driver.findElement(By.xpath("//h2[text()='Selenium WebDriver']"));
		        js.executeScript("arguments[0].scrollIntoView(true);", element);
		        Thread.sleep(1000);

		        // 5️⃣ Scroll using Keyboard (Page Down, End)
		        element.sendKeys(Keys.PAGE_DOWN);
		        Thread.sleep(1000);
		        element.sendKeys(Keys.END);
		        Thread.sleep(1000);

		        // 6️⃣ Scroll inside a WebElement (internal scroll)
		        driver.get("https://www.w3schools.com/css/css_overflow.asp");
		        WebElement scrollBox = driver.findElement(By.xpath("//div[@class='w3-example']"));

		        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scrollBox);
		        Thread.sleep(1000);

		        driver.quit();
		    }
		}
