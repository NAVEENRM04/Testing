package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class day_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome", "E:\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		System.out.println(driver.getCurrentUrl());
		String str1=driver.getCurrentUrl();
		if(str1=="https://j2store.net/free/")
		{
			System.out.println("true");
		}
		else
		{			
			System.out.println("false");
		}
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String str2 = driver.getCurrentUrl();
		System.out.print(str2);
		if(str2=="https://j2store.net/free/index.php/shop?filter_catid=11")
		{
			System.out.println("true");
		}
		else
		{			
			System.out.println("false");
		}
		

	}

}
