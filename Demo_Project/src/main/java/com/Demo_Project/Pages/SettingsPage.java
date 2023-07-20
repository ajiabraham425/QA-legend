package com.Demo_Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Demo_Project.Utilities.PageUtilities;

public class SettingsPage {
	public WebDriver driver;

	@FindBy(id = "tour_step2_menu")
	WebElement settings;
	@FindBy(xpath = "//a[text()=' Business Settings']")
	WebElement busineset;
	@FindBy(xpath = "//a[text()='Product']")
	WebElement productset;
	@FindBy(id = "enable_product_expiry")
	WebElement itemexpery;
	@FindBy(xpath = "//input[@id='enable_product_expiry']")
	WebElement prdctexpry;

	public SettingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void bussinesstngs() {

		PageUtilities.clickOnElement(settings);
		PageUtilities.clickOnElement(busineset);
		PageUtilities.clickOnElement(productset);
		PageUtilities.clickOnElement(itemexpery);
	}

	public boolean chechboxAssert() {
		return prdctexpry.isSelected();
	}

}
