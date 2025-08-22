package practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import fireflink.NinzaCrmGenericUtility.FileUtility;

public class TC_005 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;	
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p= new Properties();
		p.load(fi);
	  
		FileUtility f= new FileUtility();
		
		String browser =f.readDataFromPropertyFlie("browser");
		String Url=p.getProperty("url");
		String UN=p.getProperty("username");
		String Pwd=p.getProperty("password");
	  
		if(browser.equals("Chrome")) 
		{
			driver=new ChromeDriver();		  
		}
		else if (browser.equals("Edge"))
	  	{
			driver=new EdgeDriver();
	  	}
		else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else
	  	{
			driver=new ChromeDriver(); 
	  	}
	  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Url);
		String mainWin = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.id("inputPassword")).sendKeys(Pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Sales Order']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Create Order']")).click();

		//*[local-name()='svg']/parent::button/parent::div/preceding-sibling::label[text()='Opportunity']
		
		//label[text()='Opportunity']/following-sibling::div/child::button
		
		
		
		

	}

}
