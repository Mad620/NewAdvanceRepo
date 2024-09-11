package Organisation;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excel_Utility;
import GenericUtility.Java_Utility;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;

public class OrganisationTest extends BaseClass{
	@Test()
	public void createOrganisation() throws Throwable {
	     //   WebDriver driver;		
			Excel_Utility elib = new Excel_Utility();
			//File_Utility flib = new File_Utility();
			Java_Utility jlib = new Java_Utility();
			//WebDriver_Utility wlib = new WebDriver_Utility();

			// click on organization link
			HomePage home=new HomePage(driver);
			home.getOrgLink().click();

			// click on lookup img
			OrganizationPage orgPage = new OrganizationPage(driver);
			orgPage.clickOrgPlusImg();
		
			// TO avoid Duplicates
			int ranNum = jlib.getRandomNum();
	        String OrgName = elib.getExcelData("Organisation", 0, 0) + ranNum;
			String phnNum = elib.getExcelData("Organisation", 1, 0);
			String mailId = elib.getExcelData("Organisation", 2, 0);

			//CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);
			orgPage.enterOrgData(OrgName, phnNum, mailId);
			


	}

}
