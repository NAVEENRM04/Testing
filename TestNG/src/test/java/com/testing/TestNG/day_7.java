package com.testing.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class day_7 {
	WebDriver driver;
  @Test
  public void f() {
	  String expectedTitle="Guest Registration Form – User Registration";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  
  }

  @AfterMethod
  public void afterMethod() {
//	  driver.quit();
  }

}
