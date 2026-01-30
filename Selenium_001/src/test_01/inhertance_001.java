package test_01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class inhertance_001 {
	public static void main (String [] args ) {
    ChromeDriver driver= new ChromeDriver();
    driver.findElement(By.className(""));
    driver.get("https:google.com/");
	}
}
