package cookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	// capture all the cookies 
	Set<Cookie> cookiesList=driver.manage().getCookies();
	System.out.println("Before adding size"+cookiesList.size());
	
	for(Cookie ck: cookiesList) {
		System.out.println(ck.getName()+":"+ck.getValue());
	}
	

  // create cookie
   Cookie  coookieObje = new Cookie("TestCookie","www.amazon.in");
   
   //add  cookie  to browser
     driver.manage().addCookie(coookieObje);  
     
     // capture size /nuber of cookie
     cookiesList=driver.manage().getCookies();
     
     System.out.println("After adding size"+cookiesList.size());
 	
 	for(Cookie ck: cookiesList) {
 		System.out.println(ck.getName()+":"+ck.getValue());
 	}
  //delete  all cookie
 	driver.manage().deleteCookie(coookieObje);
  
  }    
}
