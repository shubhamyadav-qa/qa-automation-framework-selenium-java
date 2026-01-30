package Important_selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Handle_FileUpload {
	    static WebDriver driver;
	    public static void main(String[] args) throws Exception {
	   
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://example.com/upload");

	        String filePath = "C:\\Users\\Admin\\Desktop\\demo.txt";

	        uploadUsingSendKeys(filePath);
	        uploadUsingRobotClass(filePath);
	        uploadUsingJSExecutor(filePath);
	        uploadUsingActionsClass(filePath);
	        uploadUsingAutoIT();
	        
	        driver.quit();
	    }


	    // ----------------------------------------------------------
	    // 1) Direct File Upload using sendKeys()
	    // ----------------------------------------------------------
	    public static void uploadUsingSendKeys(String filePath) {
	        WebElement upload = driver.findElement(By.id("fileUpload"));
	        upload.sendKeys(filePath);
	        System.out.println("✔ Upload using sendKeys() completed");
	    }


	    // ----------------------------------------------------------
	    // 2) File Upload using Robot Class
	    // ----------------------------------------------------------
	    public static void uploadUsingRobotClass(String filePath) throws Exception {

	        driver.findElement(By.id("openDialog")).click();  // button that opens file dialog

	        Robot rb = new Robot();

	        // Copy filePath to clipboard
	        StringSelection ss = new StringSelection(filePath);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	        // CTRL + V
	        rb.keyPress(KeyEvent.VK_CONTROL);
	        rb.keyPress(KeyEvent.VK_V);
	        rb.keyRelease(KeyEvent.VK_V);
	        rb.keyRelease(KeyEvent.VK_CONTROL);

	        // ENTER
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);

	        System.out.println("✔ Upload using Robot Class completed");
	    }


	    // ----------------------------------------------------------
	    // 3) File Upload using JavaScriptExecutor
	    // ----------------------------------------------------------
	    public static void uploadUsingJSExecutor(String filePath) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Make hidden element visible
	        js.executeScript("document.getElementById('fileUploadHidden').style.display='block';");
	        driver.findElement(By.id("fileUploadHidden")).sendKeys(filePath);
	        System.out.println("✔ Upload using JavaScriptExecutor completed");
	    }


	    // ----------------------------------------------------------
	    // 4) File Upload using Actions Class
	    // ----------------------------------------------------------
	    public static void uploadUsingActionsClass(String filePath) {

	        Actions act = new Actions(driver);

	        WebElement upload = driver.findElement(By.id("fileUploadActions"));
	        act.moveToElement(upload).click().perform();
	        upload.sendKeys(filePath);

	        System.out.println("✔ Upload using Actions Class completed");
	    }


	    // ----------------------------------------------------------
	    // 5) File Upload using AutoIT
	    // ----------------------------------------------------------
	    public static void uploadUsingAutoIT() throws Exception {

	        driver.findElement(By.id("autoITBtn")).click();  // opens windows upload popup
	        Runtime.getRuntime().exec("C:\\autoit\\upload.exe");
	        System.out.println("✔ Upload using AutoIT completed");
	    }

	}


