package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_window 
{
  public static void main(String[] args) 
  {
	  ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*"); 
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		opt.addArguments("start-maximized");
		opt.addArguments("--incognito");
		WebDriver driver1 = new ChromeDriver(opt);
		driver1.get("https://www.instagram.com/onetenfashion/?hl=en");
		// TODO Auto-generated method stub

	}

}
