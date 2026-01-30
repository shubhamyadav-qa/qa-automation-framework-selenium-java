package testng_Demo;

import org.testng.annotations.Test;

public class BankAccount {

	@Test(enabled=false)
	public void  APIbankaccount() {
		System.out.println("Api bank account is what ");
	}
	@Test(enabled=true)
	public void NetBankaccount() {
		System.out.println("Net banking is very usefull");
	}

	
	@Test
	public void MobileBankAccount() {
		System.out.println("Mobile banking moderate usefull");
	}
	
}
