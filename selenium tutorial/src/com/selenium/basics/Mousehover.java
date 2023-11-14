package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mousehover 
{
  public static void main(String[] args) throws Exception
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		
		WebElement mainmenu = driver.findElement(By.linkText("Main Item 2"));
		
		a.moveToElement(mainmenu).perform();
		/*WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a"));
		a.moveToElement(subMenu).perform();
		WebElement subMenu2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]/a"));
		subMenu2.click();*/
		//a.moveToElement(subMenu2).perform();
		/*WebElement submenu = driver.findElement(By.linkText("SUB SUB LIST"));
		a.moveToElement(submenu).perform();
		Thread.sleep(5000);*/
		

	}

}
