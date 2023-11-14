package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname 
{
  public static void main(String[] args) 
  {
	  /*ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");	*/// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys("admin@mail.com");
	  System.out.println(email.getAttribute("value"));
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  for(WebElement aa : links)
	  {
		  System.out.println(aa.getText()+"------>"+aa.getAttribute("href"));
	  }
	  
	  

	}

}
