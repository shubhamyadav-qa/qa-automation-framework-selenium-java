package how_handle_failedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//it will in RetryAnalyser_test
public class RetryAnalyser  implements IRetryAnalyzer {
   // counter to keep of retry attempts
	int counterForRetryAttempts =0;
	
	// set max limit for retry 
	int SetMaxLimitForRetry= 3;

	
	// Method  to retry failed test cases
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess()) {
			if(counterForRetryAttempts< SetMaxLimitForRetry) {
				counterForRetryAttempts++;
				return true;
			}
		}
		return false;
	}
}
