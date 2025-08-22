package fireflink.NinzaCrm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fireflink.NinzaCrmGenericUtility.WebDriverUtility;

public class CreateCampaignPage extends WebDriverUtility
{
	@FindBy(xpath = "//input[@type='date']")
	private WebElement CLOSEDATE_TF;
	
	@FindBy(xpath = "//input[@name='campaignName']")
	private WebElement CAMPAIGNNAME_TF;
	
	@FindBy(xpath = "//input[@name='targetSize']")
	private WebElement TARGETSIZE_TF;
	
	@FindBy(xpath = "//button[.='Create Campaign']")
	private WebElement CREATECAMPAIGN_BTN;
	
	
	@FindBy(xpath = "//a[.='Campaigns']")
	private WebElement CAMPAIGN_BTN;
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement CONTACT_BTN;
	
	@FindBy(xpath = "//a[.='Leads']")
	private WebElement LEADS_BTN;
	
	@FindBy(xpath = "//a[.='Opportunities']")
	private WebElement OPPORTUNITIES_BTN;
	
	@FindBy(xpath = "//a[.='Products']")
	private WebElement PRODUCTS_BTN;
	
	@FindBy(xpath = "//a[.='Quotes']")
	private WebElement QUOTES_BTN;
	
	@FindBy(xpath = "//a[.='Purchase Order']")
	private WebElement PURCHASEORDER_BTN;
	
	@FindBy(xpath = "//a[.='Sales Order']")
	private WebElement SALESORDER_BTN;
	
	@FindBy(xpath = "//a[.='Invoice']")
	private WebElement INVOICE_BTN;
	
	@FindBy(xpath = "//li[.='Admin Console']")
	private WebElement ADMINCONSOLE_BTN;
	
	public CreateCampaignPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void createCampaign(WebDriver driver,String closedate,String campaignName,String targetSize) throws InterruptedException
	{
		
		CLOSEDATE_TF.sendKeys(closedate);
		CAMPAIGNNAME_TF.sendKeys(campaignName);
		scrollByAmount(driver, 0, 100);
		TARGETSIZE_TF.clear();		
		TARGETSIZE_TF.sendKeys(targetSize);
		Thread.sleep(2000);
		CREATECAMPAIGN_BTN.click();
			
	}
}
