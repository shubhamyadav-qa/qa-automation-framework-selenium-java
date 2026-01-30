package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice_interview {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement Image=driver.findElement(By.xpath("//a[text()='Images']"));
//		Image.click();
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		List <WebElement> autosugg=driver.findElements(By.xpath("//ul[@role='listbox']//li//span"));
//		autosugg.size();
//		Thread.sleep(3000);
//	WebElement aa=autosugg.get(4);
//	System.out.println(aa);
//     String a= aa.getText();
//     System.out.println(a);
//		Thread.sleep(3000);
//		System.out.println(aa.getText());
     System.out.println("Suggestion at index 4: " + autosugg.get(4).getText());
	     
		
	}

}

