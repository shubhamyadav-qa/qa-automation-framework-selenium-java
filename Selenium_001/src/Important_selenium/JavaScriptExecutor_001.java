
package Important_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_001 {
public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://example.com");

			JavascriptExecutor js = (JavascriptExecutor) driver;

			// Scroll
			js.executeScript("window.scrollBy(0,300)");

			// Find element
			WebElement btn = driver.findElement(By.id("submit"));

			// Highlight
			js.executeScript("arguments[0].style.border='3px solid red'", btn);

			// Click using JS
			js.executeScript("arguments[0].click();", btn);

			// Get title
			String title = js.executeScript("return document.title;").toString();
			System.out.println("Page Title: " + title);
		}
}
