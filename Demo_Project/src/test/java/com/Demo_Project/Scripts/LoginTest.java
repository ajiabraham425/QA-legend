package com.Demo_Project.Scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Demo_Project.Base.DemoTestBase;
import com.Demo_Project.Pages.LoginPage;
import com.Demo_Project.constants.Constants;
import com.Demo_Project.Utilities.ExcelRead;

public class LoginTest extends DemoTestBase {
	LoginPage objLog;

	@Test(dataProvider = "invalidUserInvalidPassword", priority = 1, description = "Verify whether user is able to login with invalid credentials")
	public void verifySigninInvalidUserInvalidpass(String userName, int password1) {

		objLog = new LoginPage(driver);
		objLog.setUserName(userName);

		String password2 = String.valueOf(password1);
		objLog.setPassword(password2);
		objLog.clickSignIn();

		Assert.assertEquals(objLog.loginAssert(), Constants.ErrorMsg);

	}

	@Test(dataProvider = "invalidUserValidpassword", priority = 2, description = "Verify whether user is able to login with invalid userName valid password")
	public void verifySigninInvalidUserValidpass(String userName, int password1) {

		objLog = new LoginPage(driver);
		objLog.setUserName(userName);
		String password2 = String.valueOf(password1);
		objLog.setPassword(password2);
		objLog.clickSignIn();

		Assert.assertEquals(objLog.loginAssert(), Constants.ErrorMsg);

	}

	@Test(dataProvider = "validUserInvalidPassword", priority = 3, description = "Verify whether user is able to login with valid userName invalid password")
	public void verifySigninValidUserInvalidpass(String userName, int password1) {

		objLog = new LoginPage(driver);
		objLog.setUserName(userName);
		String password2 = String.valueOf(password1);
		objLog.setPassword(password2);
		objLog.clickSignIn();

		Assert.assertEquals(objLog.loginAssert(), Constants.ErrorMsg);

	}

	@Test(dataProvider = "validUserValidpassword", priority = 4, description = "Verify whether user is able to login with valid credentials", groups = {
			"smoke" })
	public void verifySigninValidUserValidpass(String userName, int password1) {

		objLog = new LoginPage(driver);
		objLog.setUserName(userName);
		String password2 = String.valueOf(password1);
		objLog.setPassword(password2);
		objLog.clickSignIn();

		Assert.assertTrue(objLog.loginsuccessAssert());

	}

	@DataProvider
	public Object[][] invalidUserInvalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(0, 0, Constants.sheet1);
		data[0][1] = ExcelRead.getCellNumericData(0, 1, Constants.sheet1);
		return data;
	}

	@DataProvider
	public Object[][] invalidUserValidpassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(1, 0, Constants.sheet1);
		data[0][1] = ExcelRead.getCellNumericData(1, 1, Constants.sheet1);
		return data;
	}

	@DataProvider
	public Object[][] validUserInvalidPassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(2, 0, Constants.sheet1);
		data[0][1] = ExcelRead.getCellNumericData(2, 1, Constants.sheet1);
		return data;
	}

	@DataProvider
	public Object[][] validUserValidpassword() {
		Object[][] data = new Object[1][2];
		data[0][0] = ExcelRead.getCellStringData(3, 0, Constants.sheet1);
		data[0][1] = ExcelRead.getCellNumericData(3, 1, Constants.sheet1);
		return data;
	}

}
