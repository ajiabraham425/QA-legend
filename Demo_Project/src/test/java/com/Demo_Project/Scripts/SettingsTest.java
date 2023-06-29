package com.Demo_Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Demo_Project.Base.DemoTestBase;
import com.Demo_Project.Pages.SettingsPage;

public class SettingsTest extends DemoTestBase {
	SettingsPage objSettings;
	
  @Test(priority=16,description="Verify whether able to Enable Product Expiry checkbox")
  public void verifyCheckSettings() {
	  objSettings=new SettingsPage(driver);
	  objSettings.bussinesstngs();
	  
	  Assert.assertTrue(objSettings.chechboxAssert());
  }
}
