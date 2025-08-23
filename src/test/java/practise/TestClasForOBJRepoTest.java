package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import fireflink.NinzaCrm.ObjectRepository.CampaignPage;
import fireflink.NinzaCrm.ObjectRepository.CreateCampaignPage;
import fireflink.NinzaCrm.ObjectRepository.LoginPage;
import fireflink.NinzaCrm.ObjectRepository.NinzaCRMBaseClass;
import fireflink.NinzaCrmGenericUtility.WebDriverUtility;


//@Listeners(fireflink.NinzaCrmGenericUtility.Listenerimplementation.class)
public class TestClasForOBJRepoTest extends NinzaCRMBaseClass{

	@Test(groups={"smokeSuite","RegressionSuite_"})
	public void createCampaignTest() throws InterruptedException
	{	

		CampaignPage cp=new CampaignPage(driver);
		CreateCampaignPage ccp=new CreateCampaignPage(driver);
		Thread.sleep(2000);
//		Assert.fail();
		cp.clickCreateCampaign();		
		ccp.createCampaign(driver,"asdf;lkj","s" ,"nd" );
		System.out.println("Create campaign passed");
		
//		System.out.println("10");
//		WebDriver driver=new ChromeDriver();
//	
//
//		WebDriverUtility wu=new WebDriverUtility();
//		LoginPage lp=new LoginPage(driver);
//		CampaignPage cp=new CampaignPage(driver);
//		CreateCampaignPage ccp=new CreateCampaignPage(driver);
//				
//		driver.get("http://49.249.28.218:8098/");
//		wu.MaximizeWindow(driver);
//		lp.login("rmgyantra", "rmgy@9999");
//		Thread.sleep(3000);
//		cp.clickCreateCampaign();
//		ccp.createCampaign(driver, "1892025", "Capgemini", "7");
		
		
	}
	
	
	@Test
	public void sample1()
	{
		System.out.println("Sample 1 Passed");
	}

	@Test
	public void sample2()
	{
		System.out.println("Sample 2 Passed");
	}

	@Test
	public void sample3()
	{
		System.out.println("Sample 3 Passed");
	}

	@Test
	public void sample4()
	{
		System.out.println("Sample 4 Passed");
	}

	@Test
	public void sample5()
	{
		System.out.println("Sample 5 Passed");
	}

	
}
