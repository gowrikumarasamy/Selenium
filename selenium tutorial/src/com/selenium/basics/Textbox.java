
package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Textbox 
{
  public static void main(String[] args) 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("healthcare");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());// TODO Auto-generated method stub

	}

}
