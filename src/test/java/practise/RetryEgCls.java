package practise;

import org.testng.Assert;
import org.testng.annotations.Test;

import fireflink.NinzaCrm.ObjectRepository.NinzaCRMBaseClass;

public class RetryEgCls
{
	
	@Test(retryAnalyzer=fireflink.NinzaCrmGenericUtility.RetryAnalyserImplementationClass.class)
	public void eg()
	{
		
		System.out.println("asdfghjfytrewqwerfgh");
		Assert.fail();
		
	}

}
