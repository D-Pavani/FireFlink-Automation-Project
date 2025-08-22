package helperAttributes;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelperAttr
{
	@Test(priority=1)
	public void sampleTest1()
	{
		System.out.println("Sample1");
	}
	
	@Test(priority=-1)
	public void sampleTest2()
	{
		System.out.println("Sample2");
	}
	
	@Test(priority=-21)
	public void sampleTest3()
	{
		System.out.println("Sample2");
	}
	
//	@Test(priority=-21)
	@Test(invocationCount=2,priority=-2)
	public void sampleTest4()
	{
		System.out.println("Sample4");
	}
	
	@Test
	public void createUser()
	{
		Assert.fail();
		System.out.println("CreateUser");		
	}
	
	@Test(dependsOnMethods="createUser")
	public void deleteUser()
	{
		System.out.println("deleteUser");		
	}
	
	
	
	
}
