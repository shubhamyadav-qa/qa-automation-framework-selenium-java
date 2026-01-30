package java_important001;

public class ChromeDriver_1  implements BrowserDriver  {

	@Override
	public void openBrowser() {
		System.out.println("Chrome Browser Opened");
	}
	ChromeDriver_1(){
		System.out.println("shubham");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome Browser closed");
	}
	
	@Override
	public void navigate(String url) {
		System.out.println("Navigating to: " + url);
	}
	
	
}