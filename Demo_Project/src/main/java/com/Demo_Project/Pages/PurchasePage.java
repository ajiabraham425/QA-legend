package com.Demo_Project.Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Demo_Project.Utilities.FileUploadUtility;
import com.Demo_Project.Utilities.PageUtilities;
import com.Demo_Project.Utilities.TableUtilities;
import com.Demo_Project.Utilities.WaitUtilities;
import com.Demo_Project.constants.Constants;



public class PurchasePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Purchases']")
	WebElement purchase;
	@FindBy(xpath="//a[text()=' Add Purchase']")
	WebElement addpurchase;
	@FindBy(xpath="//a[text()=' List Purchase Return']")
	WebElement listpurchaseReturn;
	
	@FindBy(xpath="//table//tbody//tr[@role='row']")
	List<WebElement> rowElement;
	@FindBy(xpath="//table//thead//th")
	List<WebElement> columnElement;
	
	@FindBy(xpath="//*[@id=\"purchase_return_datatable\"]/tbody/tr[3]/td[5]")
	WebElement item;
	
	
	@FindBy(xpath="//span[text()='Browse..']")
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
		//PageUtilities.clickOnElement(addpurchase);
		PageUtilities.clickOnElement(listpurchaseReturn);
		
	}
	
	public boolean checkWebTableElement() {
		
		return TableUtilities.checkTableElement(rowElement, columnElement, Constants.TagName, Constants.searchName);
		
	}
	
	public String itemAssert() {
		WaitUtilities.waitForElementToBeVisible(driver, item);
		return item.getText();
	}
	
	public void browseFile(String path) 
	{
		PageUtilities.clickOnElement(fileBrowse);
		WaitUtilities.waitForElementToBeVisible(driver, fileBrowse);
		FileUploadUtility.uploadFileWithRobot(path);
	}
	
	public boolean browsefileAsst() {
		return removebtn.isDisplayed();
	}

}
