package com.Demo_Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Demo_Project.Base.DemoTestBase;
import com.Demo_Project.Pages.ProductPage;
import com.Demo_Project.constants.Constants;

public class ProductsTest extends DemoTestBase {
	ProductPage objProduct;
	
	@Test(priority=5,description="Verify to close end tour Window",groups={"smoke"})
	public void clickendTour() {
		  objProduct=new ProductPage(driver);
		  objProduct.endTour();
		  
		  Assert.assertTrue(objProduct.endTourAssert());
	  }
	
	
  @Test(priority=6,retryAnalyzer=com.Demo_Project.Listeners.RetryAnalyser.class,description="verify that page should be navigate to product list page",groups={"smoke"})
  public void verifyProducts() {
	  objProduct=new ProductPage(driver);
	  objProduct.selectProducts();
	  objProduct.listProducts();  
	  
	  Assert.assertTrue(objProduct.listProductAssert());
  }
  
  @Test(priority=7, description="Verify that product type is selected as single from the drop-down",groups={"smoke"})
  public void selectProductType() {
	  objProduct=new ProductPage(driver);
	  objProduct.selectlistproductType("single");
	  
	  Assert.assertTrue(objProduct.productTypeAssert());
  }
  /*
  @Test(priority=8,description="verify to select an row from table and delete from the table")
  public void verifyDeletefromTable() {
	  objProduct=new ProductPage(driver);
	  objProduct.selectRow();
  } 
  
  @Test(priority=9)
	public void selectVariationsPage() {
		  objProduct=new ProductPage(driver);
		  objProduct.selectvariations();	  
  }*/
  
  @Test(priority=10,retryAnalyzer=com.Demo_Project.Listeners.RetryAnalyser.class,description="verify that specific details is sorted by the search",groups={"smoke"})
  public void verifySearch() {
	  
	  objProduct=new ProductPage(driver);
	  objProduct.searchItem(Constants.searchName);
	  
	  Assert.assertTrue(objProduct.searchAssertion());
  }
  @Test(priority=11,groups={"smoke"},description="verify that able to navigate brands page and click on Add brand")
  public void verifyBrands() {
	  objProduct=new ProductPage(driver);
	  objProduct.selectBrands();
	  Assert.assertTrue(objProduct.selectBrandAssert());
  }
  
  @Test(priority=12,groups={"smoke"},description="verify that able to enter brand name and brand description ")
  public void verifyAddDetails() {
	  objProduct=new ProductPage(driver);
	  objProduct.addBrandDetails();
	  objProduct.addDescription();
	  Assert.assertTrue(objProduct.detailsAssert());
  }
  @Test(priority=13,groups={"smoke"},description="verify that after enter details then able to save")
  public void verifySaveDetails() {
	  objProduct=new ProductPage(driver);
	  objProduct.saveButton();
	  Assert.assertTrue(objProduct.saveButtonAssert());
  }
  }
  
  
