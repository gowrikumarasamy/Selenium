package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example 
{
  public static void main(String[] args) throws InterruptedException 
  {
	/*  ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("flights to usa from chennai");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]")).click();
		/*Alert alt = driver.switchTo().alert();
		System.out.println("the alert message is:" + alt.getText());
		Thread.sleep(3000);
		alt.dismiss();*/
		//

	}

}
