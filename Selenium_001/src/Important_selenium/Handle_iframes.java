package Important_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_iframes {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");

	        // ------------------------------
	        // 1) SWITCH TO IFRAME BY INDEX
	        // ------------------------------
	        driver.switchTo().frame(0);   // First iframe on page
	        System.out.println("Switched to iframe by INDEX");
	        Thread.sleep(1000);

	        // ------------------------------
	        // 2) SWITCH BACK TO MAIN PAGE
	        // ------------------------------
	        driver.switchTo().defaultContent();
	        System.out.println("Back to main content");
	        Thread.sleep(1000);

	        // ------------------------------
	        // 3) SWITCH TO IFRAME BY NAME/ID
	        // ------------------------------
	        driver.switchTo().frame("iframeResult");   // using name/id
	        System.out.println("Switched to iframe by NAME/ID");
	        Thread.sleep(1000);

	        // ------------------------------
	        // 4) SWITCH BACK TO PARENT FRAME
	        // ------------------------------
	        driver.switchTo().parentFrame();
	        System.out.println("Back to parent frame");

	        // ------------------------------
	        // 5) SWITCH TO IFRAME BY WEBELEMENT
	        // ------------------------------
	        WebElement iframeElement = driver.findElement(By.id("iframeResult"));
	        driver.switchTo().frame(iframeElement);
	        System.out.println("Switched to iframe by WEBELEMENT");

	        // ------------------------------
	        // 6) INTERACT INSIDE IFRAME
	        // ------------------------------
	        WebElement text = driver.findElement(By.xpath("//h1"));
	        System.out.println("Text inside iframe: " + text.getText());

	        // ------------------------------
	        // 7) SWITCH BACK TO MAIN PAGE
	        // ------------------------------
	        driver.switchTo().defaultContent();
	        System.out.println("Final return to main page");

	        driver.quit();
	    }
	

}
