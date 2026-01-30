package BatchTesting;
import org.testng.annotations.*;

public class HomeScreenTest {

	@Test
	public void  LaunchApplication() {
		System.out.println("Application launched  success");
	}
	
	
	@Test
	public void  VerifyTitle() {
		System.out.println("VerifyTitle  passed ");
	}
	
	@Test
	public void  VerifyLogo() {
		System.out.println("Verify Logo passed");
	}
	
}
