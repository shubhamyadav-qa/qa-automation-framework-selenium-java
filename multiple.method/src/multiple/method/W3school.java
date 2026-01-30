package multiple.method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class W3school {
	public static void main(String[] args) {
		ChromeDriver  driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		WebElement frame =driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
		driver.switchTo().frame(frame);
		WebElement text=driver.findElement(By.xpath("//a[@class='ga-nav subtopnav_firstitem']"));
		text.click();
		driver.switchTo().parentFrame();
		WebElement textprint=driver.findElement(By.xpath("//h1[text()='The iframe element']"));
		System.out.println(textprint.getText());
		driver.quit();
		
		System.out.println("Second scenario");
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		WebElement close=driver.findElement(By.xpath("//div[@aria-label='Close']"));
		close.click();
	
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame1);
		WebElement erase=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		System.out.println(erase.getText());
		
		
		
		
		
		
		
		
		
		
	}

	 
 

}

