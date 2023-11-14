package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable 
{
  public static void main(String[] args) throws Exception	
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
		
		@SuppressWarnings("rawtypes")
		List col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("no of cols are: " +col.size());
		
		@SuppressWarnings("rawtypes")
		List rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]/a"));
		System.out.println("no of rows are: " +rows.size());
		
		for(int i = 1; i <= 7; i++)
		{
			driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td[1]/a")).click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
	

	}

}
