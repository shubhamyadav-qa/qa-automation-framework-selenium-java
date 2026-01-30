package testng_Demo;

import org.testng.annotations.Test;

public class Group_Attribute {
	
	@Test(groups="software company")
	public void infoys() {
		System.out.println("i am testcase 1");
		}
		
		
		
		@Test(groups= "software company")
		public void wipro() {
			System.out.println("i am testcase 2");
		}
			
		
		@Test()
			public void maruti() {
				System.out.println("i am testcase 3");
				
		}
		
				@Test
				public void Tata() {
					System.out.println("i am testcase 4");
				}
		}

