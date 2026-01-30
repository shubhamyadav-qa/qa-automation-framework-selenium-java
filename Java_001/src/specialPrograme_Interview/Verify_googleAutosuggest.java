package specialPrograme_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verify_googleAutosuggest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("selenium ");

		Thread.sleep(2000);
		// print all of ----------------------------------------------
//		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@jsname='aajZCb']//div[@class='lnnVSe']//span"));
//		WebElement get= suggestions.get(9);
//		String text=get.getText();
//		System.out.println("Print 9 Number - "+text);
//
//		System.out.println("Total Suggestions: " + suggestions.size());
//           
		
		
		//  print one of them----------------------------
//      List<WebElement> list= driver.findElements(By.xpath("//div[@jsname='aajZCb']//div[@class='lnnVSe']"));
//       WebElement dd=list.get(6);
//       System.out.println(dd.getText());
		
		
		
		
		// print one of them and click it-----------
	    List<WebElement> list= driver.findElements(By.xpath("//div[@jsname='aajZCb']//div[@class='lnnVSe']"));
	    for(int i=0; i<list.size(); i++) {
	    	WebElement   source =list.get(i);
	    String ss=	source.getText();
	    	System.out.println(ss);
	    	if(ss.equalsIgnoreCase("Selenium WebDriver")) {
	    		source.click();
	    		
	    	}
	    	
	    }

	}

}
