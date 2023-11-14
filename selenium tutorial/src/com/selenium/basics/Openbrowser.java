package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Openbrowser 
{
  public static void main(String[] args) 
  {
	  /*ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
	
    driver.get("https://www.youtube.com");
    driver.manage().window().maximize();
	driver.get("https://www.youtube.com/watch?v=vtI-bMPD4Oo");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	driver.navigate().refresh();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().forward();// TODO Auto-generated method stub

	}

}
