package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt=\"Create Organization...\"]")
	private WebElement OrgPlusSign;

	public WebElement getOrgPlusSign() {
		return OrgPlusSign;
	}
	
	public void clickOrgPlusImg()
	{
	 OrgPlusSign.click();
	}
	@FindAll({@FindBy(name="accountna"),@FindBy(xpath = "//input[@name='accountname']")})
	private WebElement OrganizationName;
	
	@FindBy(id="phone")
	private WebElement phnNum;
	
	@FindBy(id="email1")
	private WebElement emailId;
	
	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public void enterOrgData(String OrgName,String phoneNum,String mailId)
	{
		OrganizationName.sendKeys(OrgName);
		phnNum.sendKeys(phoneNum);
		emailId.sendKeys(mailId);
		
	}

}
