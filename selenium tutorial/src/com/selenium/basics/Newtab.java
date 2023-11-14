package com.selenium.basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab 
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https:www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  String parentwindow = driver.getWindowHandle();
	  driver.switchTo().newWindow(WindowType.WINDOW).get("https:google.com");
	  driver.switchTo().newWindow(WindowType.WINDOW).get("https:youtube.com");
	  driver.switchTo().newWindow(WindowType.WINDOW).get("https:Voot.com");
	  driver.switchTo().newWindow(WindowType.WINDOW).get("https:hotstar.com");
	  Set<String> childwindow = driver.getWindowHandles();
	  ArrayList<String> list = new ArrayList(childwindow);
	  driver.switchTo().window(list.get(0));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  
	  
	  
	  
	  
	  

	}

}
