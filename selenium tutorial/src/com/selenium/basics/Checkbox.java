package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox 
{
  public static void main(String[] args)
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement Checkbox1 = driver.findElement(By.id("vfb-6-0"));
		Checkbox1.click();
		WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]"));
		Checkbox2.click();
		WebElement Checkbox3 = driver.findElement(By.id("vfb-6-2"));
		Checkbox3.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
  

}
