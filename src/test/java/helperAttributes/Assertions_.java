package helperAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_
{
	@Test(enabled=false)
	public void sampleTest()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		//hard assert
//		Assert.assertEquals(2, 2);
		Assert.assertEquals(3,2);
		System.out.println("4");
		System.out.println("5");
	}
	
	@Test
	public void sampleTest2()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		//soft assert
		SoftAssert s= new SoftAssert();
		s.assertEquals(2, 2);
		System.out.println("4");
		s.assertEquals(1, 2);
		System.out.println("5");
		s.assertAll();
	}
	

	
	
}
