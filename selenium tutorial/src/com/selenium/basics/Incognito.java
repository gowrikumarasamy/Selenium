package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Incognito 
{
  public static void main(String[] args) throws Exception
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		//DesiredCapabilities cap = new DesiredCapabilities();
	//	cap.setCapability(ChromeOptions.CAPABILITY,options);
	ChromeDriver d = new ChromeDriver(options);
		d.get("https://grobux.in/");
		Thread.sleep(3000);
		
		// TODO Auto-generated method stub

	}

}
