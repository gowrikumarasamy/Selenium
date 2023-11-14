package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobutton 
{
  public static void main(String[] args) 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();
		WebElement option2 = driver.findElement(By.id("vfb-7-2"));
		option2.click();
		// TODO Auto-generated method stub

	}

} 

















