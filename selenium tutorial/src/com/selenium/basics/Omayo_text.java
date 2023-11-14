package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_text 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 100)");
	  WebElement tb = driver.findElement(By.xpath("//*[@id=\"ta1\"]"));
	  tb.sendKeys("420,govinda nagar,abase nagar,chennai-000000");
	  Thread.sleep(5000);JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 700)");
		WebElement un = driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]"));
		un.sendKeys("admin@mail.com");
		WebElement pw = driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]"));
		pw.sendKeys("admin");
		 driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/button")).click();

	  
	  

	}

}
