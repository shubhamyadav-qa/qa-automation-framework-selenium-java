package testng_Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterDemo {

	
	@Test
	@Parameters({"i","j"})
	public void add(int a ,int b) {
		System.out.println(a+b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void  substraction (int a , int b) {
		System.out.println(a-b); 
	}
}
