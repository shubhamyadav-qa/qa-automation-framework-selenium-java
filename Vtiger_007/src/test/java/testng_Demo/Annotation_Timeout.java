package testng_Demo;

import org.testng.annotations.Test;

public class Annotation_Timeout {

	@Test(description="i am testcase1 hello")
	public void testCase1() {
		System.out.println("i am testcase 1");
		}
		
		
		
		@Test(timeOut = 200)
		public void testCase2() {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i am testcase 2");
		}
			
		
		@Test(description="i am testcase3 hello")
			public void testCase3() {
				System.out.println("i am testcase 3");
}
}
