package multiple.method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new 	ChromeDriver();
		driver.get("https://www.amazon.in/");


		//		Amazon par “mobile” search karo aur uske saare product names print karana h.
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		Thread.sleep(2000);
		List<WebElement> autosugg=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		//		for(WebElement auto:autosugg) {
		//			System.out.println(auto.getText());
		//		}
		//		for(int i=0; i<autosugg.size(); i++) {
		//		WebElement a=autosugg.get(i);
		//	System.out.println(	a.getText());
		//		}
		int i=0;
		do {
			WebElement aaa=	autosugg.get(i);

			System.out.println(aaa.getText());
			i++;
		}
		while(i<autosugg.size());
		
		
		
		

		//		Product Prices Print Karna Hai
		WebElement searchlap=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		searchlap.sendKeys("Laptop");
		driver.findElement(By.xpath("nav-search-submit-button")).click();
		List <WebElement> allpriceElement= driver.findElements(By.xpath(""));
		for(WebElement price:allpriceElement) {
			System.out.println(	 price.getText());
		}
		
		
		
		
	
//	Search Box ke Suggestions Print Karna hai
	
	
	}
	
}









