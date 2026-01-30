package java_important001;


public class TestRunner {
	public static void main(String[] args) {
		BrowserDriver driver = new  ChromeDriver_1();

		driver.openBrowser();
		driver.navigate("http://google.com");
		driver.closeBrowser();


	}
}