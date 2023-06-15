package com.testing;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome", "E:\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			      .withTimeout(Duration.ofSeconds(20))
			      .pollingEvery(Duration.ofSeconds(20))
			      .ignoring(NoSuchElementException.class);

			    WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			      public WebElement apply(WebDriver driver) {
			        return driver.findElement(By.id("myElement"));
			      }
			    });

			    element.click();
			    driver.quit();
				
	}

}
