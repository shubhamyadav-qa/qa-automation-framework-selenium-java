package datatypesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                            
public class Engine {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		WebElement weusername = driver.findElement(By.name("user_name"));
		weusername.sendKeys("admin12");
		
		WebElement wepssw = driver.findElement(By.name("user_password"));
		wepssw.sendKeys("admin12");
		
		WebElement welogin = driver.findElement(By.id("submitButton"));
		welogin.click();

		WebElement weusername1 = driver.findElement(By.name("user_name"));
		weusername1.sendKeys("admin13");

		WebElement wepssw1 = driver.findElement(By.name("user_password"));
		wepssw1.sendKeys("admin13");
		WebElement welogin1 = driver.findElement(By.id("submitButton"));
		welogin1.click();
		
		WebElement weusername2 = driver.findElement(By.name("user_name"));
		weusername2.sendKeys("admin");
		WebElement wepssw2 = driver.findElement(By.name("user_password"));
		wepssw2.sendKeys("admin");
		
		WebElement welogin2 = driver.findElement(By.id("submitButton"));
		welogin2.click();
	}
	
	}
