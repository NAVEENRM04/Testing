package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome", "E:\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		WebElement fname= driver.findElement(By.id("input-firstname"));
		fname.sendKeys("NAVEEN");
		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("RM");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("naveenragav73@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("qwerty");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"input-newsletter-yes\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		

		

	
	}

}
