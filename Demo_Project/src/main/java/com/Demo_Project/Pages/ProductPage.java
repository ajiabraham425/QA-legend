package com.Demo_Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Demo_Project.Utilities.FileUploadUtility;
import com.Demo_Project.Utilities.PageUtilities;
import com.Demo_Project.Utilities.WaitUtilities;

public class ProductPage {
	public WebDriver driver;

	@FindBy(xpath = "//button[text()='End tour']")
	WebElement endtour;
	@FindBy(xpath = "//h3[@class='popover-title text-bold']")
	WebElement nexttour;

	@FindBy(xpath = "//a[@id='tour_step5_menu']")
	WebElement products;
	@FindBy(xpath = "//a[text()='List Products']")
	WebElement listproducts;
	@FindBy(xpath = "//a[text()=' Add']")
	WebElement listAssert;

	@FindBy(xpath = "//select[@name='type']")
	WebElement productType;
	@FindBy(id = "product_list_filter_type")
	WebElement listproductType;
	@FindBy(xpath = "//option[@value='single']")
	WebElement typeAssert;

	@FindBy(xpath = "//input[@type='search']")
	WebElement search;
	@FindBy(xpath = "//*[@id=\"product_table\"]/tbody/tr[1]/td[9]")
	WebElement srch;

	@FindBy(xpath = "//a[text()='Add Product']")
	WebElement addproduct;

	@FindBy(xpath = "//span[text()='Brands']")
	WebElement brands;
	@FindBy(xpath = "//button[@class='btn btn-block btn-primary btn-modal']")
	WebElement addBrand;
	@FindBy(xpath = "//input[@id='name']")
	WebElement brandName;
	@FindBy(xpath = "//input[@id='description']")
	WebElement description;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;

	@FindBy(xpath = "//input[@id='name']")
	WebElement addAssert;
	@FindBy(xpath = "//input[@id='description']")
	WebElement brandAssert;
	@FindBy(xpath = "//button[@type='button' and text()=' Add']")
	WebElement saveAssert;

	@FindBy(xpath = "//div[@class='btn btn-primary btn-file']")
	WebElement phtoUpload;
	@FindBy(xpath = "//div[@class='form-control file-caption  kv-fileinput-caption']")
	WebElement fileName;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 5
	public void endTour() {
		WaitUtilities.waitForElementToBeClickable(driver, nexttour);
		PageUtilities.clickOnElement(endtour);
	}

	public String endTourAssert() {
		return nexttour.getText();
	}

	// 6
	public void selectProducts() {
		PageUtilities.clickOnElement(products);
	}

	public void listProducts() {
		PageUtilities.clickOnElement(listproducts);
	}

	public boolean listProductAssert() {
		return listAssert.isDisplayed();
	}

	// 7
	public void selectlistproductType(String values) {
		PageUtilities.selectClassDropdown(listproductType, values);
	}

	public String productTypeAssert() {

		return typeAssert.getText();
	}

	// 8
	public void searchItem(String item) {
		search.clear();
		search.sendKeys(item);
		WaitUtilities.waitForElementToBeVisible(driver, srch);
	}

	public String searchAssertion() {
		String text = srch.getText();
		return text;
	}

	// 10
	public void selectAddProduct() {
		PageUtilities.clickOnElement(addproduct);
		WaitUtilities.waitForElementToBeVisible(driver, addproduct);
	}

	public void uploadImage(String path) {
		PageUtilities.clickOnElement(phtoUpload);
		FileUploadUtility.uploadFileWithRobot(path);
	}

	public String fileAssert() {
		String fileText = fileName.getText();
		WaitUtilities.waitForElementToBeVisible(driver, fileName);
		return fileText;
	}

	// 11
	public void selectBrands() {
		PageUtilities.clickOnElement(brands);
		PageUtilities.clickOnElement(addBrand);
	}

	public boolean selectBrandAssert() {
		WaitUtilities.waitForElementToBeVisible(driver, addAssert);
		return addAssert.isEnabled();
	}

	// 12
	public void addBrandDetails() {
		PageUtilities.enterText(brandName, "Project Freestyle");
	}

	public void addDescription() {
		PageUtilities.enterText(description, "Its for demo purpose");
	}

	public boolean detailsAssert() {
		return brandAssert.isEnabled();
	}

	// 13
	public void saveButton() {
		PageUtilities.clickOnElement(save);
	}

	public boolean saveButtonAssert() {
		return saveAssert.isEnabled();
	}

}
