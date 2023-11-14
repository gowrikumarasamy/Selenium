package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation 
{
  public static void main(String[] args) throws Exception
  {  
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://in.bookmyshow.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(5000);
		driver.get("https://shopcrocs.in/");
		Thread.sleep(5000);
		driver.get("https://www.zudio.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().forward();
		// TODO Auto-generated method stub

	}

}
