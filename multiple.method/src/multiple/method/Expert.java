package multiple.method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



class Expert {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		WebElement weuser	=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuser.sendKeys("admin");
		WebElement wepassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wepassword.sendKeys("admin");
		WebElement welogin =driver.findElement(By.xpath("//input[@id='submitButton']"));
		welogin.click();

		//		How to get all links on a page
		List<WebElement>	alllinks=driver.findElements(By.xpath("//a"));
		System.out.println("all link number =  "+alllinks.size());
		for(WebElement link  :alllinks) {
			System.out.println("link name= "+link.getAttribute("href"));
			System.out.println("link text=   "+link.getText());
		}

		WebElement clicklead	=	driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		clicklead.click();


		//How to count all buttons on a webpage
		List<WebElement> allbutton=driver.findElements(By.tagName("Button"));
		System.out.println("Button no=  "+allbutton.size());
		for(WebElement button :allbutton) {
			System.out.println("Button text=  "+button.getText());
		}


		//How to select all checkboxes in a form?
		List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("All checkbox=   "+allcheckboxes.size());
		for(WebElement checkbox: allcheckboxes) {
			System.out.println("checkbox text=  "+checkbox.getText());
		}


		//-How to count all images on a page?
		List<WebElement>allimage=driver.findElements(By.xpath("//img"));
		System.out.println("number of image=   "+allimage.size());
		for(WebElement image: allimage) {
			System.out.println("image text=  "+image.getText());
		}



		//Q5-How to click on a link based on its text?
		List<WebElement> linkclick=driver.findElements(By.linkText("//td/a[@href=\"javascript:void(0);\"]"));
		System.out.println("no of link=  "+linkclick.size());
		for(WebElement click: linkclick)
			System.out.println("link text=  "+click.getText());




		//Q6-How to print all options from a dropdown?
		WebElement  dropdown=driver.findElement(By.xpath("//select[@name='viewname']"));
		Select sel=new Select(dropdown);
		List	<WebElement> option=sel.getOptions();
		for(WebElement selobj:option) {
			System.out.println("option text =  "+selobj.getText());
		}



		//Q7-How to print all rows from a table?
		List<WebElement> allrows	=driver.findElements(By.xpath("//table[@border='0']"));
		int sizetable=	allrows.size();
		System.out.println("no of rows=  "+sizetable);
		for(WebElement tab:allrows) {
			System.out.println("row text=   s"+tab.getText());
		}

		//			🟢 Q8. How to count all textboxes on the “Create Lead” page?
		List<WebElement>	numtxtbox=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("number of textboxes=  "+numtxtbox.size());
		for(WebElement textbox: numtxtbox) {
			System.out.println("textbox   name  =  "+textbox.getAttribute("type"));
		}	


		WebElement addclick =driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		addclick.click();


		//	🟢 Q12. How to count all radio buttons present in a form?
		List <WebElement> allradiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of radiobutton =  "+allradiobutton.size());
		for(WebElement radiobton:allradiobutton) {
			System.out.println("radio button text=  "+radiobton.getText());
		}

             
		
		
		

	}
}

