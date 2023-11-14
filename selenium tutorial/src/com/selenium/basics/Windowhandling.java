package com.selenium.basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling 
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.partialLinkText("Crea")).click();

		driver.findElement(By.id("terms-link")).click();
		
		Set<String> windows = driver.getWindowHandles();	
	
		ArrayList<String> al=new ArrayList<>(windows);

		driver.switchTo().window(al.get(1));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());



	}

}
