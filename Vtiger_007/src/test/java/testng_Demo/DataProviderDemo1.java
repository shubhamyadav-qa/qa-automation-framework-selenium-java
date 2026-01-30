package testng_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
		          
		//get from another class  dataprovider  value
		
		@Test(dataProvider ="searchDataSet", dataProviderClass= DataProviderDemo2.class)
		public void name(String country , String monument) {
			// launch browser
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(country+""+monument);
			driver.findElement(By.name("btnK")).submit();

		}
}
