package fireflink.NinzaCrmGenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of generic methods related to WebDriver
 * @author Dammavalam Pavani
 */


public class WebDriverUtility
{

	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void MaximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void MinimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	
	/**
	 * This method will fullscereen the window
	 * @param driver
	 */
	public void FullScreenWindow(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	
	
	/**
	 * This method will made driver to wait implicitely
	 * @param driver
	 */
	
	public void impliciteWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

	/**
	 * This method will made the driver to wait untill element to be visible
	 * @param driver
	 * @param WebElement
	 */
	public void explicitelyWaitForElementToBeVisible(WebDriver driver,WebElement we)
	{
	    WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOf(we));
	}
	
	
	/**
	 * This method will made the driver to wait untill element to be clickable
	 * @param driver
	 * @param WebElement
	 */
	public void explicitelyWaitForElementToBeClickable(WebDriver driver,WebElement we)
	{
	    WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		wt.until(ExpectedConditions.elementToBeClickable(we));
	}
	
	

	/**
	 * This method will select the option by visible text
	 * @param Select
	 * @param text
	 */
	public void handlleDropDown(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);	
	}
	
	
	/**
	 * This method will select the option by visible text
	 * @param Select
	 * @param index
	 */
	public void handlleDropDown(WebElement ele,int index)
	{
		Select s = new Select(ele);
		s.selectByIndex(index);	
	}
	
	
//	/**
//	 * This method will select the option by visible text
//	 * @param Select
//	 * @param value
//	 */
//	public void handlleDropDown(WebElement ele,String value)
//	{
//		Select s = new Select(ele);
//		s.selectByValue(value);	
//	}
	
		
	/**
	 * This method will over the mouse to particular position on webpage
	 * @param d
	 * @param offset1
	 * @param offset2
	 */
	public void mouseOvering(WebDriver d,int offset1,int offset2) 
	{
		Actions a=new Actions(d);
		a.moveByOffset(offset1, offset2);			
	}
	
	
	/**
	 * This method will over the mouse to particular element
	 * @param d
	 * @param w
	 */
	public void mouseOvering(WebDriver d,WebElement w) 
	{
		Actions a=new Actions(d);
		a.moveToElement(w);	
	}
	
	
	/**
	 * This method will drag and drop the source element and drop it in to destination element
	 * @param d
	 * @param src
	 * @param des
	 */
	public void DragandDrop(WebDriver d,WebElement src,WebElement des)
	{
		Actions a=new Actions(d);
		a.dragAndDrop(src, des);
		
	}
	
	
	/**
	 * This method will click andhold the element upto 2 seconds
	 * @param d
	 * @param w
	 * @throws InterruptedException
	 */
	public void ClickandHold(WebDriver d,WebElement w) throws InterruptedException
	{
		Actions a=new Actions(d);
		a.clickAndHold(w);
		Thread.sleep(2000);
	}
	
	/**
	 * This method will double click on webpage where mouse is pointed
	 * @param d
	 */
	public void DoubleClick(WebDriver d)
	{
		Actions a=new Actions(d);
		a.doubleClick();
	}
	
	/**
	 * This method will double click on webElement
	 * @param d
	 * @param w
	 */
	public void DoubleClick(WebDriver d,WebElement w)
	{
		Actions a=new Actions(d);
		a.doubleClick(w);
	}
	
	
	
	/**
	 * This method will context(Right) click on webpage where mouse is pointed
	 * @param d
	 */
	public void ContextClick(WebDriver d)
	{
		Actions a=new Actions(d);
		a.contextClick();
	}
	
	
	/**
	 * This method will context click on webElement
	 * @param d
	 * @param w
	 */
	public void ContextClick(WebDriver d,WebElement w)
	{
		Actions a=new Actions(d);
		a.contextClick(w);
	}
	
	/**
	 * This method will scroll the web page  to the element
	 * @param d
	 * @param w
	 */
	public void moveToElement(WebDriver d,WebElement w)
	{
		Actions a=new Actions(d);
		a.scrollToElement(w);
	}
	
	/**
	 * This method will scroll the webpage based on offset values of x and y
	 * @param d
	 * @param x
	 * @param y
	 */
	public void scrollByAmount(WebDriver d,int x,int y)
	{
		Actions a=new Actions(d);
		a.scrollByAmount(x, y);
		
	}
	
	
	/**
	 * This method will scroll the webpage based on origin and coordinate values
	 * @param d
	 * @param origin
	 * @param x
	 * @param y
	 */
	public void scrollByAmount(WebDriver d,ScrollOrigin origin,int x,int y)
	{
		Actions a=new Actions(d);
		a.scrollFromOrigin(origin, x, y);
	}
	
	
	/**
	 * This method will switch to the frame by using frame index
	 * @param d
	 * @param index
	 */
	public void switchinToFrame(WebDriver d,int index)
	{
		d.switchTo().frame(index);
	}
	
	/**
	 * This method will switch to the frame by using frame attributte value
	 * @param d
	 * @param value
	 */
	public void switchinToFrame(WebDriver d,String value)
	{
		d.switchTo().frame(value);
	}
	
	/**
	 * This method will switch to the frame by using it's pr4eviously located Webelement
	 * @param d
	 * @param w
	 */
	public void switchinToFrame(WebDriver d,WebElement w)
	{
		d.switchTo().frame(w);
	}
	
	
	/**
	 * This method will moves the control from current frame to it's previous frame
	 * @param d
	 */
	public void switchToParent(WebDriver d)
	{
		d.switchTo().parentFrame();
	}
	
	/**
	 * This method will switch to the frame from current frame to it's 1st parent frame
	 * @param d
	 */
	public void switchTo1stFrame(WebDriver d)
	{
		d.switchTo().defaultContent();
	}
	
	/**
	 * This method will handle the alert by accepting it
	 * @param d
	 */
	public void acceptAlert(WebDriver d)
	{
		Alert a=d.switchTo().alert();
		a.accept();
	}
	
	/**
	 * This method will handle the alert by dissminssing it
	 * @param d
	 */
	public void dissmissAlert(WebDriver d)
	{
		Alert a=d.switchTo().alert();
		a.dismiss();
	}
	
	
	/**
	 * This method will handle the alert by sending the data to alert
	 * @param d
	 * @param data
	 */
	public void sendDataToAlert(WebDriver d, String data)
	{
		Alert a=d.switchTo().alert();
		a.sendKeys(data);	
	}
	
	/**
	 * This method will returns the alert text to caller
	 * @param d
	 * @param data
	 * @return
	 */
	public String getAlerttext(WebDriver d, String data)
	{
		Alert a=d.switchTo().alert();
		return a.getText();
		
		
	}
	
	
	/**
	 * This method is used to switch to window
	 * @param driver
	 * @param title
	 */
	public void switchTo(WebDriver driver,String title)
	{
		Set<String> allWin = driver.getWindowHandles();
		for(String session:allWin)
		{
			if((driver.switchTo().window(session).getTitle()).contains(title))
			{
				break;
			}
		}
	}
	
	
	public String captureScreenShot(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(".\\ScreenShot\\"+screenShotName+".png");
		FileHandler.copy(src, des);
		return des.getAbsolutePath();//return the Screenshot path 
		
	}
	

}

