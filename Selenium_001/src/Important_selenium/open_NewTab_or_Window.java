package Important_selenium;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_NewTab_or_Window {

		    public static void main(String[] args) {

		        ChromeDriver driver = new ChromeDriver();
		        driver.get("https://google.com");

		        // Store the main window ID
		        String mainWindow = driver.getWindowHandle();

		        // ---------------------------
		        // 1. Open NEW TAB
		        // ---------------------------
		        driver.switchTo().newWindow(WindowType.TAB);
		        driver.get("https://facebook.com");
		        System.out.println("New Tab Title: " + driver.getTitle());

		        // Switch back to main window
		        driver.switchTo().window(mainWindow);

		        // ---------------------------
		        // 2. Open NEW WINDOW
		        // ---------------------------
		        driver.switchTo().newWindow(WindowType.WINDOW);
		        driver.get("https://youtube.com");
		        System.out.println("New Window Title: " + driver.getTitle());

		        // Get all window IDs (for interview point)
		        Set<String> allWindows = driver.getWindowHandles();
		        System.out.println("Number of windows open: " + allWindows.size());

		        // Close the new window
		        driver.close(); 

		        // Switch back to main window again
		        driver.switchTo().window(mainWindow);

		        driver.quit();
		    }
		}

	
