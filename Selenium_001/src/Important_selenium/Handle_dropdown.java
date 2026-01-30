package Important_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Handle_dropdown {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		List <WebElement> welogin=driver.findElements(By.xpath("//div[@class='input']//input"));
		welogin.get(0).sendKeys("admin");
		welogin.get(1).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		WebElement qikdropdown =driver.findElement(By.xpath("//select[@id='qccombo']"));
		Select sel=new Select(qikdropdown);
		sel.selectByIndex(4);
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println(	qikdropdown.getText());
        
	//example   -----------------------------------------------------------------
	
		// Different methods of selection
		sel.selectByIndex(4);
		sel.selectByValue("Leads");
		sel.selectByVisibleText("Lead");

		// Get selected option
		System.out.println("Selected: " + sel.getFirstSelectedOption().getText());

		// Get all options
		System.out.println("All dropdown values:");
		for (WebElement opt : sel.getOptions()) {
		    System.out.println(opt.getText());
		}
		// Check multi-select
		System.out.println("Is multi-select: " + sel.isMultiple());
	}
}
