package fireflink.NinzaCrm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadPage
{
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
	
	
	
	@FindBy(xpath = "//input[@name='leadStatus']")
	private WebElement LEADSTATUS_TF;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement LEADNAME_TF;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement COMPANY_TF;
	 
	@FindBy(xpath = "//input[@name='leadSource']")
	private WebElement LEADSOURCE_TF;
	 
	@FindBy(xpath = "//input[@name='industry']")
	private WebElement INDUSTRY_TF;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement PHONE_TF;
	
	
	@FindBy(xpath = "//input[@name='rating']")
	private WebElement RATING_TF;
	
	@FindBy(xpath = "//input[@name='assignedTo']")
	private WebElement ASSIGNEDTO_TF;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement ADDRESS_TF;
	
	 
	 

}
