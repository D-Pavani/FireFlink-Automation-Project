package fireflink.NinzaCrm.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPage
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
	
	@FindBy(xpath = "//span[.='Create Lead']")
	private WebElement CREATELEAD;
	
	/**
	 * This method clicks Campaingns button in NinzaCRM leads page
	 */
	public void Campaigns_Click()
	{
		CAMPAIGN_BTN.click();
	}
	
	
	/**
	 * This method clicks Contacts button in NinzaCRM leads page
	 */
	public void Contacts_Click()
	{
		CONTACT_BTN.click();
	}
	
	
	/**
	 * This method clicks Leadss button in NinzaCRM leads page
	 */
	public void Leads_Click()
	{
		LEADS_BTN.click();
	}
	
	
	/**
	 * This method clicks Oppurtunities button in NinzaCRM leads page
	 */
	public void Oppurtunities_Click()
	{
		OPPORTUNITIES_BTN.click();
	}
	
	
	/**
	 * This method clicks Products button in NinzaCRM leads page
	 */
	public void Products_Click()
	{
		PRODUCTS_BTN.click();
	}
	
	
	/**
	 * This method clicks Quotes button in NinzaCRM leads page
	 */
	public void Quotes_Click()
	{
		QUOTES_BTN.click();
	}
	
	
	/**
	 * This method clicks Purchase Order button in NinzaCRM leads page
	 */
	public void PurchaseOrder_Click()
	{
		PURCHASEORDER_BTN.click();
	}
	
	/**
	 * This method clicks Sales Order button in NinzaCRM leads page
	 */
	public void SalesOrder_Click()
	{
		SALESORDER_BTN.click();
	}
	
	
	/**
	 * This method clicks Invoice button in NinzaCRM leads page
	 */
	public void Invoice_Click()
	{
		INVOICE_BTN.click();
	}
	
	
	/**
	 * This method clicks Admin Console button in NinzaCRM leads page
	 */
	public void AdminConsole_Click()
	{
		ADMINCONSOLE_BTN.click();
	}
	
	
	/**
	 * This method clicks CREATELEAD button in NinzaCRM leads page
	 */
	public void clickCreateLead()
	{
		CREATELEAD.click();
	}
	
	
	
	
	
	
		
}
