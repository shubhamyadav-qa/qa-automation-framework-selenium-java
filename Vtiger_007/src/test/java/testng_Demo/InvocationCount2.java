package testng_Demo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCount2 {
	
                                 
		@Test(invocationCount=1)
		public void name(ITestContext context) {
			int  currentInvocation=context.getAllTestMethods()[0].getCurrentInvocationCount();
			System.out.println("Excuting "+ currentInvocation);
			System.out.println("hello");
		}
}
