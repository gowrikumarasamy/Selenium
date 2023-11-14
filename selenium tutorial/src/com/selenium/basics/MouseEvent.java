package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver  = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.switchTo().frame(0);
	  WebElement from = driver.findElement(By.id("draggable"));
	  WebElement to = driver.findElement(By.id("droppable"));
	  Actions a = new Actions(driver);
	  a.dragAndDrop(from, to).build().perform();
	  
	  ;

	}

}
