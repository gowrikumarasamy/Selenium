package com.selenium.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrollupanddown 
{
  public static void main(String[] args) throws Exception
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeAsyncScript("window.scrollBy(0,7000)");
//		js.executeScript("window.scrollBy(0,5000)");
//		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 7000)");//scrollup
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,-3600)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 3000)");
		//js.executeScript("window.scrollBy(0,3800)");
	}

}
