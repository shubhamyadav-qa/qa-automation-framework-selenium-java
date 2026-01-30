package Important_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_ToolTip_001 {
	

	    public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://example-tooltip-site.com");  // Replace with your site

	        // ============================
	        // 1. Tooltip in title attribute
	        // ============================
	        WebElement titleEle = driver.findElement(By.id("titleTooltip"));
	        String titleTooltip = titleEle.getAttribute("title");
	        System.out.println("Title Attribute Tooltip: " + titleTooltip);

	        // ==================================
	        // 2. Tooltip in aria-label attribute
	        // ==================================
	        WebElement ariaEle = driver.findElement(By.id("ariaTooltip"));
	        String ariaTooltip = ariaEle.getAttribute("aria-label");
	        System.out.println("ARIA Tooltip: " + ariaTooltip);

	        // ===============================================
	        // 3. Tooltip in data-original-title (Bootstrap)
	        // ===============================================
	        WebElement bootstrapEle = driver.findElement(By.id("bootstrapTooltip"));
	        String bootstrapTooltip = bootstrapEle.getAttribute("data-original-title");
	        System.out.println("Bootstrap Tooltip: " + bootstrapTooltip);

	        // ==============================
	        // 4. Tooltip visible on Hover
	        // ==============================
	        WebElement hoverEle = driver.findElement(By.id("hoverTooltip"));

	        Actions act = new Actions(driver);
	        act.moveToElement(hoverEle).perform();

	        Thread.sleep(1000);  // wait for tooltip to appear

	        WebElement hoverTooltipText = driver.findElement(By.xpath("//div[contains(@class,'tooltip')]"));
	        System.out.println("Hover Tooltip Text: " + hoverTooltipText.getText());

	        // ===================================================
	        // 5. Tooltip using JavaScript + Hover (scroll if needed)
	        // ===================================================
	        WebElement jsEle = driver.findElement(By.id("jsTooltip"));

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", jsEle);

	        act.moveToElement(jsEle).perform();
	        Thread.sleep(1000);

	        WebElement jsTooltipText = driver.findElement(By.xpath("//div[contains(@class,'tooltip')]"));
	        System.out.println("JS Based Tooltip Text: " + jsTooltipText.getText());

	        // =====================
	        // 6. Tooltip in Any Attribute
	        // =====================
	        WebElement allAttr = driver.findElement(By.id("anyTooltip"));

	        System.out.println("title: " + allAttr.getAttribute("title"));
	        System.out.println("aria-label: " + allAttr.getAttribute("aria-label"));
	        System.out.println("data-original-title: " + allAttr.getAttribute("data-original-title"));
	        System.out.println("data-tooltip: " + allAttr.getAttribute("data-tooltip"));

	        driver.quit();
	    }
	}
