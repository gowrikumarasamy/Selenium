package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileupload 
{
  public static void main(String[] args) 
  {
	  
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\DELL\\Downloads\\jdk-16.0.2_windows-x64_bin.exe");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		//button[@id='submitbutton']"//BUTTON[@ID='submitbutton']"
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		// TODO Auto-generated method stub

	}

}
