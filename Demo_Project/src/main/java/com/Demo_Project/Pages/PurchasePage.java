package com.Demo_Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Demo_Project.Utilities.PageUtilities;



public class PurchasePage {
	
	public WebDriver driver;
	
	@FindBy(id="tour_step6")
	WebElement purchase;
	
	@FindBy(xpath="//a[text()=' Add Purchase']")
	WebElement addpurchase;
	
	@FindBy(id="upload_document")
	WebElement fileBrowse;
	
	@FindBy(xpath="//span[text()='Remove']")
	WebElement removebtn;
	
	
	public PurchasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void selectPurchase() {
		PageUtilities.clickOnElement(purchase);
		PageUtilities.clickOnElement(addpurchase);
	}
	
	public void browseFile(String path) 
	{
		PageUtilities.enterText(fileBrowse, path);
	}
	
	public boolean browsefileAsst() {
		return removebtn.isDisplayed();
	}

}
