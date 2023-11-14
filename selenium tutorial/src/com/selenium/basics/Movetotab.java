package com.selenium.basics;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Movetotab 
{
  public static void main(String[] args)throws Exception 
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
	  driver.get("https://www.hotstar.com/in");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  ((JavascriptExecutor)driver).executeScript("window.open()");
	  
	  
	  ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(1));
	  driver.get("https://in.bookmyshow.com/");
	  Thread.sleep(3000);
	  
	  ((JavascriptExecutor)driver).executeScript("window.open()");
	  ArrayList<String> tab3 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab3.get(2));
	  driver.get("https://www.smule.com/");
	  Thread.sleep(3000);
	  
	  
	  /*ArrayList<String> tab4 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab4.get(3));
	  driver.get("https://www.instagram.com/");
	  Thread.sleep(3000);*/
	  
	   ArrayList<String> tab1R= new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tab1R.get(0));
	   //driver.switchTo().window(tab1R.get(0));)
	   driver.get("https://www.instagram.com/");
	   Thread.sleep(3000);
	   
	   
	   ArrayList<String> tab2R = new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tab2R.get(1));
	   driver.get("https://www.flipkart.com");
	   Thread.sleep(3000);
	   
	   ArrayList<String> tab3R = new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tab3R.get(2));
	Thread.sleep(3000);
	driver.get("https://www.amazon.in/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84");
	Thread.sleep(6000);

	  
	  
	  
	  
	  
	  
	  // TODO Auto-generated method stub

	}

}
