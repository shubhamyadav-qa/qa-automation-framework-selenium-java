package testng_Demo;

import org.testng.annotations.Test;

public class InvocationClass {

	@Test(invocationCount=3)
	public void name() {
		System.out.println("hello");
	}
}
