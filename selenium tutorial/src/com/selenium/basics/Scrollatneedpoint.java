package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollatneedpoint 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement point = driver.findElement(By.linkText("KPN Travels"));
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	 // js.executeScript("arguments[1].scrollIntoView();",point);
	  js.executeScript("arguments[0].scrollIntoView();",point);


	}

}
