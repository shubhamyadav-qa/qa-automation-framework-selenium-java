package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFindElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		List<WebElement> weuser=driver.findElements(By.xpath("//div[@class='input']/input"));
		weuser.get(0).sendKeys("admin");
		weuser.get(1).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//		⿡ Q1: Find how many lead records (rows) are displayed on the Leads page table and print the total count.
		driver.findElement(By.linkText("Leads")).click();
		List<WebElement> rowlead=driver.findElements(By.xpath(""));
		System.out.println("Total lead records displayed:   "+rowlead.size());



		//	⿢ Q2: Use findElements() to get all the lead names from the Leads table and print each name in the console.
		List<WebElement>	leadname =driver.findElements(By.xpath(""));
		System.out.println("Lead Names displayed on the page:");
		for(WebElement firstname: leadname) {
			System.out.println(firstname.getText());
		}

		//Q3: Find all the checkboxes beside each lead name using findElements() and click on the first three checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath(""));
		for(int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();	
		}
		System.out.println("Clicked on first three lead checkboxes.");


		//⿤ Q4: Locate all the “Edit” buttons in the Leads table and print how many edit buttons are available
		List <WebElement> editbutn=driver.findElements(By.xpath("//table[@class='lvt small']//a[text()='edit']"));
		System.out.println("edit buttons are available   "+editbutn.size());
		for(WebElement editshow: editbutn) {
			System.out.println(editshow.getText());
		}


		//⿥ Q5: Get all the lead email IDs displayed in the email column and print them one by one.
		List <WebElement> emaildisplay=driver.findElements(By.xpath(""));
		System.out.println("the lead email IDs displayed in the email");
		for(WebElement email:emaildisplay) {
			System.out.println(email.getText());
		}

		//Q6: Use findElements() to count how many lead sources (like Website, Referral, Advertisement) are listed on the page.
		//		List<WebElement> leadsource=driver.findElements(By.xpath(""));
		//		System.out.println("lead sources "+ leadsource.size());
		//		for(WebElement leadsrc: leadsource) {
		//			System.out.println(leadsrc.getText());
		//		}
		//        ⿧ Q7: Find all the status values (like New, Contacted, Qualified, Lost) in the Leads table and print them.
		List<WebElement> statusvalue=driver.findElements(By.xpath(""));
		System.out.println("Lead Status values displayed on the page:");
		for(WebElement status: statusvalue) {
			System.out.println(status.getText());
		}

		//        ⿨ Q8: Locate all the lead phone numbers displayed in the table and print them in the console
		List<WebElement> leadnum=driver.findElements(By.xpath(""));
		System.out.println("Lead Phone Numbers displayed on the page:");
		for(WebElement leadnumber: leadnum) {
			System.out.println(leadnumber.getText());
		}

		//        Q9: Use findElements() to find all the lead names starting with the letter ‘A’ and print those names only
		List <WebElement>leadstrtwitha=driver.findElements(By.xpath(""));
		for(WebElement leadnamea: leadstrtwitha) {
			String Leadnam=leadnamea.getText();
			if (Leadnam.startsWith("A")) {
				System.out.println(Leadnam);
			}
		}
		//        🔟 Q10: Find all Delete icons/buttons on the Leads list and click only on the last delete icon.
		List<WebElement> deleteIcons = driver.findElements( By.xpath("//table[@class='lvt small']//a[text()='del']"));

		// Check if any delete icon is present
		if (deleteIcons.size() > 0) {
			// Click on the last Delete icon
			deleteIcons.get(deleteIcons.size() - 1).click();
			System.out.println("Clicked on the last Delete icon.");

			// Handle confirmation alert (if appears)
			driver.switchTo().alert().accept();
		} else {
			System.out.println("No Delete icons found on the page.");
		}


		try {
			weuser.get(0).sendKeys("admin");
			weuser.get(1).sendKeys("admin");
		}
		catch{
			weuser.get(0).sendKeys("admin");
			weuser.get(1).sendKeys("admin");
		}
	}}






	}



}


