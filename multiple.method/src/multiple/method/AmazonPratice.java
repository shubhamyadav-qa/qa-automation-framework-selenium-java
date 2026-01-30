package multiple.method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonPratice {
	public static void main(String[] args) {
		ChromeDriver driver= new 	ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Headphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> rating=driver.findElements(By.xpath("//a[@aria-label='4.2 out of 5 stars, rating details']"));
		System.out.println("rating star: "+rating.size());
		for(WebElement ratestar: rating) {
			System.out.println(ratestar.getAttribute("aria-label"));

		}



		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Men's shirt");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> producttotalcount =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		System.out.println("Total Men T-Shirts displayed on first page: "+producttotalcount.size());



		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement>product  =driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		ArrayList<String> shoesname=new ArrayList<String>();
		for(WebElement Prodname:product) {
			System.out.println(Prodname.getText());
		}
		Collections.sort(shoesname);
		System.out.println("Product Names Alphabetical Order me");
		for(String shoe:shoesname) {
			System.out.println(shoe);
		}


	}
}
