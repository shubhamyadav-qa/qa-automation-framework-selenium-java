package testng_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
// for three keyword combination 
	// 1. India  QutubMinar
	//2. Agra Tajmahal
	//3. Hyderabad Charminar
	
	@DataProvider(name ="searchDataSet")
	public Object[][] searchData() {
		Object[][] searchKeyword = new Object[3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="QutubMinar";
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="TajMahal";
		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]="Charminar";
	
		return searchKeyword;
	}
	          
	
	@Test(dataProvider ="searchDataSet")
	public void name(String country , String monument) {
		// launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(country+""+monument);
		driver.findElement(By.name("btnK")).submit();

	}
}
