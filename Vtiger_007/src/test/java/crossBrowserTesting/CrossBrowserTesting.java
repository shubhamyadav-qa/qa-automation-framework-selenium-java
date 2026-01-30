package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowserTesting {

	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser) {
		
		switch(browser.toLowerCase()) {
		case "chrome":
		driver=new ChromeDriver();
		break;
		
		
	case "msedge":
		driver=new EdgeDriver();
		break;
		}	
}

	
	
	@Test
	public void verifyTitle() {
		driver.get("http://www.google.como");
		String Actualtitle = driver.getTitle();
		String  expectedTitle = "Google"; 
		Assert.assertEquals(Actualtitle, expectedTitle);
	}
	
	
}
