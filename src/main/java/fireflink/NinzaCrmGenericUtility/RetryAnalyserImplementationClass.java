package fireflink.NinzaCrmGenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementationClass implements IRetryAnalyzer
{

	int count =0;
	int retryCount =4;
	
	@Override
	public boolean retry(ITestResult result)
	{
		while (count<retryCount)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
