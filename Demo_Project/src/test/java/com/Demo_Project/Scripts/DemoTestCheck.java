package com.Demo_Project.Scripts;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

public class DemoTestCheck {
	WebDriver driver;
  @Test
  public void f() {
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123123");
		WebElement password;
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://qalegend.com/billing/public/login");
	  driver.manage().window().maximize();
  }

}
