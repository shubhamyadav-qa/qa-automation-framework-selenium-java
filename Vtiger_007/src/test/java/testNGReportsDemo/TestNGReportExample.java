package testNGReportsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReportExample {

	@Test
	public  void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Reporter.log("browser is open");
	}
}
