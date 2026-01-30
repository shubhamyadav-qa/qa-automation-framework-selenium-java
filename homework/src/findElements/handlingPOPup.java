package findElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingPOPup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions	options= new ChromeOptions ();
		options.addArguments("--size-maximize");
        ChromeDriver driver =new ChromeDriver();
//          driver.get("https://demo.guru99.com/test/delete_customer.php");
//          driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
//          driver.findElement(By.xpath("//input[@name='submit']")).click();
//          Alert alert =driver.switchTo().alert();
//          System.out.println(alert.getText()+"Alert Message");
//          alert.accept();
//          Thread.sleep(2000);
//          Alert alert2=driver.switchTo().alert();
//          System.out.println(alert2.getText()+"   =alertmessage");
//          alert2.accept();
	driver.get("http://localhost:8888/index.php?action=index&module=Home");
	
	
	}
}


   
