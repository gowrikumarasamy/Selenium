package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headless 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https:www.facebook.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.navigate().to("https://www.google.com");
	  driver.navigate().back();
	  driver.navigate().forward();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.close();
	  

	}

}
