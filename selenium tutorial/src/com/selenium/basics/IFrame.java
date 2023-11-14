package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IFrame 
{
  public static void main(String[] args) throws Exception
  {
	  /*ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.switchTo().frame("moneyiframe");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='moneyiframe']")));
		String nse = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nse);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.findElement(By.linkText("MOVIES")).click();
		//Thread.sleep(3000);
	}
}
