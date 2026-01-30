package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
//		WebElement frameparent=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		driver.switchTo().frame(frameparent);
//		WebElement framechild=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
//		driver.switchTo().frame(framechild);
//		WebElement text=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
//		System.out.println(text.getText());
//		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
//		WebElement frameparent1=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
//		String headtext=frameparent1.getText();
//		System.out.println(headtext);
//		driver.quit();
//		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
//		WebElement parentframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		driver.switchTo().frame(parentframe);
//		WebElement child=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
//		driver.switchTo().frame(child);
//		driver.switchTo().parentFrame();
//		WebElement text1=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
//		System.out.println(text.getText());




	}
}
