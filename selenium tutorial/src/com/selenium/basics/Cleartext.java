package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartext 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//input[@id=\"textbox1\"]")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.id("textbox1")).sendKeys("selenium");
	  Thread.sleep(2000);
	  
	  
	  
	  
	  

	}

}
