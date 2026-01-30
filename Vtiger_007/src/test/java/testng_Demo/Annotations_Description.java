package testng_Demo;

import org.testng.annotations.Test;

public class Annotations_Description {
	
	@Test(description="i am testcase1 hello")
public void testCase1() {
	System.out.println("i am testcase 1");
	}
	
	
	
	@Test(description="i am testcase2 hello")
	public void testCase2() {
		System.out.println("i am testcase 2");
	}
		
	
	@Test(description="i am testcase3 hello")
		public void testCase3() {
			System.out.println("i am testcase 3");
			
}
}
