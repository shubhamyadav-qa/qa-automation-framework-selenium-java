package testng_Demo;

import org.testng.annotations.Test;

public class Annotation_priority {
	@Test(priority=1)
	public void testCase1() {
		System.out.println("i am testcase 1");
		}
		
		@Test(description="i am testcase2 hello")
		public void testCase2() {
			System.out.println("i am testcase 2");
		}
		
		@Test
		public void testCase3() {
			System.out.println("i am testcase 3");
		}
		
		@Test(priority=2)
			public void testCase4() {
				System.out.println("i am testcase 4");
		
		}
}
