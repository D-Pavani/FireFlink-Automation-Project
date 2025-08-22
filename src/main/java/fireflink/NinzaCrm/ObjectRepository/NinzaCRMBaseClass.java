package fireflink.NinzaCrm.ObjectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



import fireflink.NinzaCrmGenericUtility.FileUtility;
import fireflink.NinzaCrmGenericUtility.JavaUtility;
import fireflink.NinzaCrmGenericUtility.WebDriverUtility;

public class NinzaCRMBaseClass 
{
	
	public WebDriver driver;
	JavaUtility jUtil = new JavaUtility();
	FileUtility fUtil=new FileUtility();
	WebDriverUtility wUtil=new WebDriverUtility();
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun=true)
	public void bsConfig()
	{
		System.out.println("base class execution Started ");
	}
	
//	@BeforeTest(alwaysRun=true)
//	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void bcConfig(/*String BROWSER1*/) throws IOException
	{
	String 	BROWSER =fUtil.readDataFromPropertyFlie("browser");
	String 	URL =fUtil.readDataFromPropertyFlie("url");
	
	if(BROWSER.equals("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if (BROWSER.equals("Edge"))
	  {
		driver=new EdgeDriver();
	  }
	  else if (BROWSER.equals("firefox")) 
	  {
			driver=new FirefoxDriver();
	  }
	  else
	  {
		  driver=new ChromeDriver(); 
	  }
	 driver.get(URL);
	 wUtil.MaximizeWindow(driver);
	 wUtil.impliciteWait(driver);
	 sdriver=driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public void bmConfigLogin() throws IOException, InterruptedException
	{
		String 	USERNAME =fUtil.readDataFromPropertyFlie("username");
		String 	PASSWORD =fUtil.readDataFromPropertyFlie("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void amConfigLogout()
	{
		LoginPage lp=new LoginPage(driver);
		lp.logout();
	}
	
//	@AfterTest(alwaysRun=true)
	@AfterClass(alwaysRun=true)
	public void acConfig()
	{
		driver.quit();
		
	}
	
	@AfterSuite(alwaysRun=true)
	public void asConfig()
	{
		System.out.println(" base class execution Completed ");
	}
	
	
}

