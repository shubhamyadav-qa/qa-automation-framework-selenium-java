package Important_selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots_selenium001 {

	    public static void main(String[] args) throws IOException {

	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");

	        // -----------------------------
	        // 1. FULL PAGE SCREENSHOT
	        // -----------------------------
	        File full = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(full, new File("./Screenshots/fullpage.png"));

	        // -----------------------------
	        // 2. SPECIFIC ELEMENT SCREENSHOT
	        // -----------------------------
	        WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
	        File ele = logo.getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(ele, new File("./Screenshots/element.png"));

	        // -----------------------------
	        // 3. SCREENSHOT WITH TIMESTAMP
	        // -----------------------------
	        String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        File timeShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(timeShot, new File("./Screenshots/screenshot_" + time + ".png"));

	        // -----------------------------
	        // 4. SCREENSHOT AS BYTE[]
	        // (Useful for reporting tools like ExtentReport)
	        // -----------------------------
	        byte[] byteData = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	        System.out.println("Byte Screenshot Size : " + byteData.length);

	        // -----------------------------
	        // 5. SCREENSHOT OF A PARTICULAR SECTION (DIV)
	        // -----------------------------
	        WebElement searchBoxSection = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']"));
	        File section = searchBoxSection.getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(section, new File("./Screenshots/section.png"));

	        driver.quit();
	    }
	}
