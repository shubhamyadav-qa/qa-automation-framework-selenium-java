package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonCartValidation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");

		Thread.sleep(300);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone apple 16 ");
		Thread.sleep(300);
		WebElement search_btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Thread.sleep(300);
		search_btn.click();
		List<WebElement> productFirst=driver.findElements(By.xpath("//div[@class='puisg-row']//div[@data-cy='title-recipe']"));
		WebElement firstProductName =productFirst.get(0);
		String productDetail= firstProductName.getText();
		
     List<WebElement> firstProductPrice= driver.findElements(By.xpath("//div[@class='puisg-row']//span[@class='a-price']"));
     WebElement price=firstProductPrice.get(0);

				System.out.println("First Product Title: " +productDetail );
				System.out.println("First Product Price: ₹" + price.getText());
	}
}





