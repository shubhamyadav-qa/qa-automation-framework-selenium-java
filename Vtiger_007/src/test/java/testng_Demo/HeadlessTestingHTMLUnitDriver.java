package testng_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingHTMLUnitDriver {
public static void main(String[] args) {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless=new");
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://www.google.com");
	System.out.println("Before search : "+driver.getTitle());
	
	
}
}
