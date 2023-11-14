package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Rightclicktest
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver d= new ChromeDriver(opt);
	  /*d.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	  d.manage().window().maximize();
	  Actions a = new Actions(d);
	  WebElement link = d.findElement(By.id("div-context"));
	  a.contextClick(link).perform();
	  link.click();
	   d.findElement(By.id("ui-id-4")).click();
	   d.switchTo().alert().accept();*/
	  d.get("https://demoqa.com/slider");
	//input[@type="range"]
	  WebElement link = d.findElement(By.xpath("//input[@type='range']"));
	 
	  for(int i = 100; i >=0; i--)
		{
			link.sendKeys(Keys.ARROW_LEFT);
			
		}
	  for(int i = 100; i >= 0; i++)
		{
			link.sendKeys(Keys.ARROW_RIGHT);
			
		}
	  Thread.sleep(1000);

	  

	}

}

