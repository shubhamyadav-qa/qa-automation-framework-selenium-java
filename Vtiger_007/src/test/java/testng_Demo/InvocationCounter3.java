package testng_Demo;

import org.testng.annotations.Test;

public class InvocationCounter3 {
	
		int count =1;
		
		@Test(invocationCount=3)
		public void name() {
			System.out.println("hello"+count);
			count++;
		}
	}

