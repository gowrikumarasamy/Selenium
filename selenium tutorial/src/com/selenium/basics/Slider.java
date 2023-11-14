
package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Slider 
{
  public static void main(String[] args) throws Exception
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
	  WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));////*[@id=\"slider\"]/span
		////div[@id='slider']
		Thread.sleep(5000);
		for(int i = 1; i <= 100; i++)
		{
			slider.sendKeys(Keys.ARROW_RIGHT);
			
		}
		Thread.sleep(5000);
		for(int i = 100; i>=30; i--)
		{
			slider.sendKeys(Keys.ARROW_LEFT);
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		// TODO Auto-generated method stub

	}

}
