package fireflink.NinzaCrm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage
{
	@FindBy(id="username")
	private WebElement USERNAME;
	
	@FindBy(id="inputPassword")
	private WebElement PASSWORD;
	
	@FindBy(xpath = "//button[.='Sign In']")
	private WebElement LOGIN_BTN;
	
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement PROFILE_BTN;
	
	@FindBy(xpath = "//div[.='Logout ']")
	private WebElement LOGOUT_BTN;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	/**
	 * This method performs the user login of the  Ninza CRM application
	 * @param username
	 * @param password
	 * @throws InterruptedException 
	 */
	public void login(String username,String password) throws InterruptedException
	{
		USERNAME.sendKeys(username);
		PASSWORD.sendKeys(password);
		LOGIN_BTN.click();
		Thread.sleep(3000);
	}
	
	public void logout()
	{
		PROFILE_BTN.click();
		LOGOUT_BTN.click();
	}
	
	
}
