package test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadTest extends Login_Class {
 static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
	LeadTest lea=new	LeadTest();
	lea.name(driver);
}
	public  void name(WebDriver driver) throws InterruptedException {
		login(driver);
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).clear();
     driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
    
     
	}


}