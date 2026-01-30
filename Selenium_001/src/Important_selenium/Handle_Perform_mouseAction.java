package Important_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Perform_mouseAction {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/buttons");
	        driver.manage().window().maximize();
	        Actions act = new Actions(driver);

	        // 1. Click
	        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
	        act.click(clickBtn).perform();

	        // 2. Double Click
	        WebElement doubleBtn = driver.findElement(By.id("doubleClickBtn"));
	        act.doubleClick(doubleBtn).perform();

	        // 3. Right Click (Context Click)
	        WebElement rightBtn = driver.findElement(By.id("rightClickBtn"));
	        act.contextClick(rightBtn).perform();

	        // Move to Element example
	        driver.get("https://www.myntra.com/");
	        WebElement menu = driver.findElement(By.xpath("//a[text()='Men']"));
	        act.moveToElement(menu).perform();

	        // Drag and Drop example
	        driver.get("https://demoqa.com/droppable");
	        WebElement drag = driver.findElement(By.id("draggable"));
	        WebElement drop = driver.findElement(By.id("droppable"));
	        act.dragAndDrop(drag, drop).perform();

	        // Click and Hold + Release example
	        act.clickAndHold(drag).moveToElement(drop).release().perform();

	        // Send Keys example (using Actions)
	        driver.get("https://www.google.com/");
	        WebElement search = driver.findElement(By.name("q"));
	        act.moveToElement(search).click().sendKeys("Selenium Actions class example").perform();

	        // Build + Perform example (optional)
	        act.moveToElement(search).sendKeys(" build perform").build().perform();

	        driver.quit();
	   

}
}
