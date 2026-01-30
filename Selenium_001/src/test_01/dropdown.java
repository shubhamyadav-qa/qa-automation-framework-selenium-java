package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		List<WebElement> login=driver.findElements(By.xpath("//div[@class='inputs']//input"));

		login.get(0).sendKeys("admin");

		login.get(1).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		WebElement seldrop=driver.findElement(By.xpath("//select[@class='small']"));
		Select sel = new Select (seldrop);
		sel.selectByIndex(0);
		System.out.println(sel.getFirstSelectedOption().getText());

	}
}
