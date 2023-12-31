package com.Demo_Project.Utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {

	public Alert waitForAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}

	public void hitenter(WebDriver driver, WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	public void sendTestUsingMouseActions(WebDriver driver, WebElement element, String text) {
		Actions action = new Actions(driver);
		action.sendKeys(element, text).build().perform();
	}

	public void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public static Select selectClassDropdown(WebElement element, String value) {
		Select obj = new Select(element);
		obj.selectByValue(value);
		return obj;
	}

	public static void scrollWindow(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static String getElementText(WebElement element) {
		return element.getText();
	}

	public static void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
