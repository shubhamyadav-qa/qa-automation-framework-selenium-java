package how_handle_failedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseExample {  
	// go in test-output folder inside present testng-failed.xml run it 

	@Test
	public void TestCase01() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void TestCase02() {
		Assert.assertTrue(false);	
	}
	
	@Test
	public void TestCase03() {
		Assert.assertTrue(true);	
	}
}
