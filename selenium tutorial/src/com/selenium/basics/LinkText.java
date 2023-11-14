package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkText 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.partialLinkText("unt")).click();// TODO Auto-generated method stub

	}

}
