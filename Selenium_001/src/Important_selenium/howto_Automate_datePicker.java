package Important_selenium;


import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class howto_Automate_datePicker {
	public static void main(String[] args) throws InterruptedException {
		
	
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        driver.get("https://demo.automationtesting.in/Datepicker.html");

	        // ------------------------------
	        // METHOD 1: Direct sendKeys()
	        // ------------------------------
	        WebElement direct = driver.findElement(By.id("datepicker1"));
	        direct.clear();
	        direct.sendKeys("20/11/2025");
	        Thread.sleep(2000);


	        // ------------------------------
	        // METHOD 2: Select Year + Month + Date
	        // ------------------------------
	        driver.get("https://jqueryui.com/datepicker/");
	        driver.switchTo().frame(0);  // datepicker inside iframe

	        driver.findElement(By.id("datepicker")).click(); // open calendar

	        // Select Year
	        Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	        year.selectByVisibleText("2025");

	        // Select Month
	        Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	        month.selectByVisibleText("November");

	        // Select Date
	        driver.findElement(By.xpath("//a[text()='20']")).click();
	        Thread.sleep(2000);

	        driver.switchTo().defaultContent();


	        // ------------------------------
	        // METHOD 3: Using Next/Previous Buttons
	        // ------------------------------
	        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

	        driver.findElement(By.id("first_date_picker")).click(); // open calendar

	        String targetMonth = "November";
	        String targetYear = "2025";

	        while (true) {
	            String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
	            String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

	            if (currentMonth.equals(targetMonth) && currentYear.equals(targetYear)) {
	                break;
	            }

	            // Click NEXT arrow until matched
	            driver.findElement(By.xpath("//a[@title='Next']")).click();
	        }

	        driver.findElement(By.xpath("//a[text()='20']")).click();
	        Thread.sleep(2000);


	        // ------------------------------
	        // METHOD 4: JavaScript Executor
	        // ------------------------------
	        driver.get("https://demoqa.com/date-picker");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.getElementById('datePickerMonthYearInput').value='11/20/2025'");
	        Thread.sleep(2000);

	        driver.quit();
	    }
	}


