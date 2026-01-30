package Important_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_MultipleWindows {
public static void main(String [] args ) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open"); 
	        driver.manage().window().maximize();

	        // -------------------------------
	        // 1️⃣ Get Parent Window ID
	        // -------------------------------
	        String parentID = driver.getWindowHandle();
	        System.out.println("Parent Window ID: " + parentID);

	        // Click button to open new window
	        driver.switchTo().frame("iframeResult");
	        driver.findElement(By.tagName("button")).click();

	        // -------------------------------
	        // 2️⃣ Get All Window IDs
	        // -------------------------------
	        Set<String> allIDs = driver.getWindowHandles();
	        System.out.println("All Window IDs: " + allIDs);

	        // -------------------------------
	        // 3️⃣ Switch to Child Window
	        // -------------------------------
	        for (String id : allIDs) {
	            if (!id.equals(parentID)) {
	                driver.switchTo().window(id);
	                System.out.println("Switched to Child Window: " + id);
	                break;
	            }
	        }

	        // Perform action on child window
	        Thread.sleep(2000);
	        System.out.println("Child Window Title: " + driver.getTitle());

	        // -------------------------------
	        // 4️⃣ Close Child Window
	        // -------------------------------
	        driver.close();
	        System.out.println("Child window closed");

	        // -------------------------------
	        // 5️⃣ Switch Back to Parent Window
	        // -------------------------------
	        driver.switchTo().window(parentID);
	        System.out.println("Switched back to Parent Window");
	        System.out.println("Parent Title: " + driver.getTitle());

	        // -------------------------------
	        // 6️⃣ Handling Multiple Child Windows
	        //    (Example: open 2 new windows)
	        // -------------------------------
	        driver.switchTo().frame("iframeResult");
	        driver.findElement(By.tagName("button")).click();  // 1st window
	        driver.findElement(By.tagName("button")).click();  // 2nd window

	        Set<String> multiIDs = driver.getWindowHandles();

	        for (String id : multiIDs) {
	            if (!id.equals(parentID)) {
	                driver.switchTo().window(id);
	                System.out.println("Closing window: " + driver.getTitle());
	                driver.close();
	            }
	        }

	        // Switch back to parent
	        driver.switchTo().window(parentID);

	        // -------------------------------
	        // 7️⃣ Close All Windows
	        // -------------------------------
	        driver.quit();
	    }
	}

