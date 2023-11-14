package com.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{
  public static void main(String[] args) throws Exception
  {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions a = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		//button[text()='Double-Click Me To See Alert']
		
		a.doubleClick(dc).perform();
//		a.doubleClick(dc).perform();
		Thread.sleep(6000);
		Alert alt = driver.switchTo().alert();
		System.out.println("Double click alert message is \n" + alt.getText());
		Thread.sleep(5000);
		alt.accept();
		
		/*WebElement rc = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		a.click(rc).perform();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println("right click alert message is \n" + al.getText());
		Thread.sleep(1000);
		al.accept();*/// TODO Auto-generated method stub

	}

}
