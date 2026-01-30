package test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		WebElement childframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(childframe);
		WebElement detailinchild =driver.findElement(By.tagName("h1"));
		Thread.sleep(3000);
		String text=detailinchild.getText();
		System.out.println(text);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
//		driver.switchTo().frame("iframeResult");
//		driver.switchTo().frame(null);
		
		
		
	}
}
