package test_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Vtiger_01 {
	public static void main(String[] args) throws InterruptedException {
		
		Vtiger_01 call =new Vtiger_01();
		call.ma();
	}
		
		 public void ma () {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//	Select sel =new Select ();
		//	Actions act = new Actions(driver);
		driver.get("http://localhost:8888/index.php?module=Products&action=index");
		List <WebElement> Loginpage=driver.findElements(By.xpath("//div[@class='inputs']//input"));
		Loginpage.get(0).sendKeys("admin");
		Loginpage.get(1).sendKeys("admin");
		Loginpage.get(2).click();

		WebElement clickhomeBtn=driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']"));
		String getHomeAttri=clickhomeBtn.getAttribute("value");
		System.out.println(getHomeAttri);
		String textHomebtn=clickhomeBtn.getText();
		System.out.println(textHomebtn);
		clickhomeBtn.click();

		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();

		//lead Module
		WebElement clicklead_module=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		clicklead_module.click();

		List<WebElement> leadDocument=driver.findElements(By.xpath("//td[@style='padding:10px']//tr[@style='height:25px']//input"));
		leadDocument.get(0).sendKeys("Shubham");
		leadDocument.get(1).sendKeys("Yadav");
		leadDocument.get(2).sendKeys("Yadav");
		leadDocument.get(3).sendKeys("8423256722");
		leadDocument.get(4).sendKeys("Saritron");
		leadDocument.get(5).sendKeys("84231522222222");
		leadDocument.get(6).sendKeys("saritron.pvtd");
		leadDocument.get(7).sendKeys("Fax.com");
		leadDocument.get(8).sendKeys("shubhamyadav3222@gmail.com");
		leadDocument.get(9).sendKeys("Google.com");
		leadDocument.get(10).sendKeys("4000000");
		leadDocument.get(11).sendKeys("45");
		leadDocument.get(12).sendKeys("yadavshubham5257@gmail.com");
		leadDocument.get(13).click();
		leadDocument.get(14).click();
		leadDocument.get(15).sendKeys("Saritron is missing");
		leadDocument.get(16).sendKeys("221701");
		leadDocument.get(17).sendKeys("gandhi park");
		leadDocument.get(18).sendKeys("country");
		leadDocument.get(19).sendKeys("odisha");

		WebElement click_savebtn=driver.findElement(By.xpath("//td[@style='padding:10px']//div/input[@class='crmButton small save']"));
		click_savebtn.click();

		// organisation module
		WebElement click_organisationModule=driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		click_organisationModule.click();
        
		WebElement Add_btn_org=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		Add_btn_org.click();
		List<WebElement> organisation_detail=driver.findElements(By.xpath("//td[@style='padding:10px']//tr[@style='height:25px']//input"));
		organisation_detail.get(0).sendKeys("shub");
		organisation_detail.get(1).sendKeys("3456789");
		organisation_detail.get(2).sendKeys("saritron.com");
		organisation_detail.get(3).sendKeys("1234567898");
		organisation_detail.get(5).sendKeys("Fax0012");
		organisation_detail.get(6).sendKeys("ambani");
		organisation_detail.get(9).sendKeys("1234567655");
		organisation_detail.get(10).sendKeys("223");
		organisation_detail.get(11).sendKeys("shubhamiit@gmail.com");
		organisation_detail.get(12).sendKeys("shub@dsbbegmail.com");
		organisation_detail.get(13).sendKeys("yadav");
		organisation_detail.get(14).sendKeys("si_99232");
		organisation_detail.get(15).click();
		organisation_detail.get(16).sendKeys("2345234");
		organisation_detail.get(17).click();
		organisation_detail.get(19).click();
		organisation_detail.get(20).sendKeys("bill_00223");
		organisation_detail.get(21).sendKeys("box is po");
		organisation_detail.get(22).sendKeys("odisha");
		organisation_detail.get(23).sendKeys("chennai");
		organisation_detail.get(24).sendKeys("West bengal");
		organisation_detail.get(25).sendKeys("kashmir");
		organisation_detail.get(26).sendKeys("877756");
		organisation_detail.get(27).sendKeys("876766");
		organisation_detail.get(28).sendKeys("africa");
		organisation_detail.get(29).sendKeys("south africa"); 
		
		
		List <WebElement> save_organisationdetail=driver.findElements(By.xpath("//td[@style='padding:10px']//div/input[@class='crmbutton small save']"));
		save_organisationdetail.get(0).click();
		// contact module
		WebElement click_contactsModule=driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"));
		click_contactsModule.click();

		WebElement Add_btn_cont=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		Add_btn_cont.click();

		List <WebElement>  contact_detail=driver.findElements(By.xpath("//td[@style='padding:10px']//tr[@style='height:25px']//input"));
		contact_detail.get(0).sendKeys("shubham");
		contact_detail.get(1).sendKeys("vt0012");
		contact_detail.get(2).sendKeys("Yadav");
		contact_detail.get(3).sendKeys("234567890123");
		contact_detail.get(4).sendKeys("saritron");
		contact_detail.get(7).sendKeys("9876543219");
		contact_detail.get(8).sendKeys("1234567898");
		contact_detail.get(9).sendKeys("Saritech");
		contact_detail.get(10).sendKeys("87654345654");
		contact_detail.get(11).sendKeys("it department");
		contact_detail.get(12).sendKeys("Faxdfhhfru001");
		contact_detail.get(13).sendKeys("yadavshubham2345678@gmail.com");
		contact_detail.get(14).sendKeys("1990-1-12");
		contact_detail.get(15).sendKeys("Assite google");
		contact_detail.get(16).sendKeys("saritron");
		contact_detail.get(19).sendKeys("9876543212");
		contact_detail.get(20).sendKeys("shubhamkumar1232@gmail.com");
		contact_detail.get(21).click();
		contact_detail.get(22).click();
		contact_detail.get(23).click();
		contact_detail.get(26).click();
		contact_detail.get(28).click();
		contact_detail.get(29).sendKeys("67-5-1899");
		contact_detail.get(30).sendKeys("30-9-2233");
		contact_detail.get(31).sendKeys("saritron it solution ");
		contact_detail.get(32).sendKeys("sarityro is getttingn late");
		contact_detail.get(33).sendKeys("japan");
		contact_detail.get(34).sendKeys("china");
		contact_detail.get(35).sendKeys("pakistan");
		contact_detail.get(36).sendKeys("kappor");
		contact_detail.get(37).sendKeys("345566");
		contact_detail.get(38).sendKeys("345566");
		contact_detail.get(39).sendKeys("america");
		contact_detail.get(40).sendKeys("south america");

		WebElement save_contact=driver.findElement(By.xpath("//td[@style='padding:10px']//div/input[@class='crmButton small save']"));
		save_contact.click();
		
        WebElement click_opporunitiesModule=driver.findElement(By.xpath("//a[@href='index.php?module=Potentials&action=index']"));
        click_opporunitiesModule.click();
	}
}
