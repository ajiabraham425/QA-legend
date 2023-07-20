package com.Demo_Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Demo_Project.Utilities.PageUtilities;

public class LoginPage {

	public WebDriver driver;
	@FindBy(xpath = "//input[@id='username']")
	WebElement user;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login;

	@FindBy(className = "help-block")
	WebElement errormsg;
	@FindBy(className = "dropdown-toggle")
	WebElement username;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String userName) {
		user.clear();
		PageUtilities.enterText(user, userName);
	}

	public void setPassword(String password1) {
		PageUtilities.enterText(password, password1);
	}

	public void clickSignIn() {
		PageUtilities.clickOnElement(login);
	}

	public String loginAssert() {
		return errormsg.getText();
	}

	public boolean loginsuccessAssert() {
		return username.isDisplayed();
	}

}
