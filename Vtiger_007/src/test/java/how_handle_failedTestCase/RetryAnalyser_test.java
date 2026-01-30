package how_handle_failedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyser_test {
	@Test(retryAnalyzer = RetryAnalyser.class)
	public void TestCase01() {
		Assert.assertTrue(false);
	}
	
	@Test(retryAnalyzer = RetryAnalyser.class)
	public void TestCase02() {
		Assert.assertTrue(false);	
	}
	
	@Test
	public void TestCase03() {
		Assert.assertTrue(true);	
		
		
		
		
	}
}
