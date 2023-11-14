package com.selenium.basics;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass 
{
  public static void main(String[] args) throws Exception
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement Gmail = d.findElement(By.xpath("//a[@class='gb_d']"));//"//a[text()='Gmail']"
		Actions a=new Actions(d);
		a.contextClick(Gmail).build().perform();
		Thread.sleep(5000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	    //r.keyPress(KeyEvent.VK_DOWN);
	
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// TODO Auto-generated method stub

	}




}
