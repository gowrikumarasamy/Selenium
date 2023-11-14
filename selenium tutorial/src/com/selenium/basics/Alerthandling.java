package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerthandling 
{
	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://brm.tremplintech.in/web_pages/login.aspx");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txt_unam")).sendKeys("sylix");//input[@name='txt_unam']
		driver.findElement(By.id("txt_pass")).sendKeys("3456@#$");
		driver.findElement(By.id("Button3")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println("the alert message is: " + alt.getText());
		alt.accept();
		driver.findElement(By.id("txt_unam")).sendKeys("sylix");
		driver.findElement(By.id("txt_pass")).sendKeys("admin");
		driver.findElement(By.id("Button3")).click();

	}

}
