package com.Demo_Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Demo_Project.Base.DemoTestBase;
import com.Demo_Project.Pages.PurchasePage;
import com.Demo_Project.constants.Constants;


public class PurchaseTest extends DemoTestBase {
	PurchasePage purchase;
	
	@Test(priority=14,retryAnalyzer=com.Demo_Project.Listeners.RetryAnalyser.class,groups={"sanity"},description="Verify that page navigates to purchase page")
	public void verifyPurchase()
	{
		purchase=new PurchasePage(driver);
		purchase.selectPurchase();
		 
	}
	/*
  @Test(priority=15,description="verify that the file will be uploaded ",groups={"sanity"})
  public void verifyFileUpload() {
	  
	  purchase=new PurchasePage(driver);
	  purchase.browseFile(Constants.fileupload);
	  
	Assert.assertTrue(purchase.browsefileAsst());  
	  
  }
  */
  @Test(priority=15,retryAnalyzer=com.Demo_Project.Listeners.RetryAnalyser.class)
  public void verifyElementTable() {
	  purchase=new PurchasePage(driver);
	  
	 purchase.checkWebTableElement();
	 
	 Assert.assertEquals(purchase.itemAssert(),Constants.CheckTableElement);
	 
	 //Assert.assertTrue(purchase.checkWebTableElement());
	  
  }
  
}
