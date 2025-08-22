package practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_01 {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=null;
		
		FileInputStream fis=new FileInputStream(".//fireflink.NinzaCrm.automationFramework/src/test/resources/CommonData.properties");
		Properties p= new Properties();
		p.load(fis);
		
		if(p.getProperty("browser").equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(p.getProperty("browser").equals("edge"))
		{
			driver=new EdgeDriver();		
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("")).sendKeys("");
	

	}

}
