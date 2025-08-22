package fireflink.NinzaCrm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fireflink.NinzaCrmGenericUtility.WebDriverUtility;

public class CampaignPage extends WebDriverUtility
{
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement SEARCHDROPDOWN;
	
	@FindBy(xpath = "//input[@placeholder='Search by Campaign Id']")
	private WebElement SEARCHCAMPAIGN;
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement CREATECAMPAIGN;
	
	
	
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
	
	
	public CampaignPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	/**
	 * This method will search the campaigin based on campaign name
	 * @param text
	 * @param campaignInfo
	 */
	public void SearchCampaign(String text,String campaignInfo)
	{
		handlleDropDown(SEARCHDROPDOWN,text);
		SEARCHCAMPAIGN.sendKeys(campaignInfo);//search text field.sendkeys();
	}
	
	
	/**
	 * This method will search the campaigin based on campaign id
	 * @param index
	 * @param campaignInfo
	 */
	public void SearchCampaign(int index,String campaignInfo)
	{
		handlleDropDown(SEARCHDROPDOWN,index);
		SEARCHCAMPAIGN.sendKeys(campaignInfo);		
	}
	
	
	/**
	 * This method will click the Create campaign button in capaign page
	 */
	public void clickCreateCampaign() 
	{
		CREATECAMPAIGN.click();
		
	}
	
	
	
}
