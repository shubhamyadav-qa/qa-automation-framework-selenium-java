package bill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loop_12 {
  
  public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
WebElement uqwer	   =driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
uqwer.sendKeys("8423156728");

 WebElement qwer=driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
qwer.sendKeys("Shubham@123");

WebElement wqwq=driver.findElement(By.xpath("//button[@name=\"login\"]"));
wqwq.click();
   WebElement qaqa=driver.findElement(By.xpath("//div[@class=\"rc-anchor-center-container\"]"));
//
//qaqa.click();

	
}  	


}

