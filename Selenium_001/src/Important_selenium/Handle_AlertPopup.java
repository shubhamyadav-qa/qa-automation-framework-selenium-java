package Important_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("school");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		//---all alert type with their example -------

		        driver.manage().window().maximize();
		        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		        // -----------------------------
		        // 1. SIMPLE ALERT
		        // -----------------------------
		        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		        Alert simpleAlert = driver.switchTo().alert();

		        System.out.println("Simple Alert Text: " + simpleAlert.getText());  // getText()
		        simpleAlert.accept();  // OK

		        Thread.sleep(1000);

		        // -----------------------------
		        // 2. CONFIRM ALERT
		        // -----------------------------
		        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		        Alert confirmAlert = driver.switchTo().alert();

		        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
		        confirmAlert.dismiss();   // Cancel

		        Thread.sleep(1000);

		        // -----------------------------
		        // 3. PROMPT ALERT
		        // -----------------------------
		        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		        Alert promptAlert = driver.switchTo().alert();

		        System.out.println("Prompt Alert Text: " + promptAlert.getText());
		        promptAlert.sendKeys("Hello from Selenium!");  // sendKeys()
		        promptAlert.accept();  // OK

		        Thread.sleep(1000);

		        driver.quit();
		    
		

	}
}
