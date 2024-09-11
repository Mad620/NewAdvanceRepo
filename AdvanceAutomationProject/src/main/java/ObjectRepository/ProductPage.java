package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Products']")
	private WebElement product_Link;
	@FindBy(xpath = "//img[@alt=\"Create Product...\"]")
private WebElement clickHookUpImg;
	
	@FindBy(name="productname")
	private WebElement prdName;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	public void clickOnProduct_link() {
		product_Link.click();
	}
	
	public void clickPrdHookUp()
	{
		clickHookUpImg.click();
	}
	
	public void enterPrdNAme(String name)
	{
		prdName.sendKeys(name);
	}
	
	public void clickSaveButton()
	{
		saveButton.click();	
	}
	
}


