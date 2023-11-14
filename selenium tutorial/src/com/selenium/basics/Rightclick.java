package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Rightclick 
{
  public static void main(String[] args) throws Exception
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions a = new Actions(driver);
		WebElement rc = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	   a.contextClick(rc).perform();
		Thread.sleep(2000);
		WebElement rc1 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[5]/span"));
		a.contextClick(rc1).build().perform();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println("right click successfully \n" + alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
	}

}
