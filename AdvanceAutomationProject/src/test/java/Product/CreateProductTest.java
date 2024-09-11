package Product;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excel_Utility;
import GenericUtility.Java_Utility;
import ObjectRepository.ProductPage;
//pull
public class CreateProductTest extends BaseClass {
@Test()
public void createProduct() throws Throwable {
	Excel_Utility elib=new Excel_Utility();
	Java_Utility jlib=new Java_Utility();
	ProductPage product=new ProductPage(driver);
	product.clickOnProduct_link();
	product.clickPrdHookUp();
	int ranNum=jlib.getRandomNum();
	String PrdName=elib.getExcelData("ProductSheet", 0, 0)+ranNum;
	product.enterPrdNAme(PrdName);
	product.clickSaveButton();
}
}


