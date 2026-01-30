package BatchTesting;
import  org.testng.annotations.*;



public class PaymentTest {

	
	@Test
	public  void CashOnDelivery() {
		System.out.println("cash on delivery is  passed");
	}
	
	@Test
	public void NetBanking() {
		System.out.println("NetBanking passed");
	}
}
