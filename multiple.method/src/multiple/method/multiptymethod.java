package multiple.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiptymethod {
	public static void main(String[] args) {
		
		
	//	\ Explanation: ChromeDriver class ka object create karke browser launch karna
      //
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		// Step 2: Gmail login page open kro
//         Explanation: Gmail login page ka URL hit karna
//        */
//		driver.get("https://mail.google.com/mail/");
		driver.get("https://mail.google.com/mail/u/0/");
		WebElement wess =driver.findElement(By.xpath("//*[@type='email']"));
	wess.sendKeys("shubhamyadav72239@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		

		


		    }
		}

	