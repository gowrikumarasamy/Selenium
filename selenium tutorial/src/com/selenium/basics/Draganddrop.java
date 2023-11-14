package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
  public static void main(String[] args) throws Exception
  {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement From = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions a = new Actions(driver);
		a.dragAndDrop(From, To).build().perform();
		Thread.sleep(9000);
		WebElement obj5000 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement placehold1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement placehold2 = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollby(0,7000)");
        Thread.sleep(6000);
		a.dragAndDrop(obj5000, placehold1).build().perform();
		Thread.sleep(6000);
		a.dragAndDrop(obj5000, placehold2).build().perform();
		
		//*[@id="credit1"]/a sales
		// TODO Auto-generated method stub

	}

}
