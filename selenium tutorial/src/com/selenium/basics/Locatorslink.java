package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorslink 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https:www.facebook.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement forgotpass = driver.findElement(By.partialLinkText("Gr"));
	  forgotpass.click();

	}

}
