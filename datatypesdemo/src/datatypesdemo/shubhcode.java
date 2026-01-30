package datatypesdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shubhcode {
	public static void main(String[] args) {
     ChromeDriver driver= new ChromeDriver();		
		driver.get("https://www.amazon.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
		searchbox.sendKeys("mobile");
		List<WebElement> autosuggestion=driver.findElements(By.xpath(""));
		System.out.println(autosuggestion.size());
		
	}
	

}

