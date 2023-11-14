package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandling 
{
 public static void main(String[] args) 
 {
	 WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> table = driver.findElements(By.xpath("/html/body/div[2]/div[5]/table"));
		
		///html/body/div[2]/div[5]/table
		////*[@id="leftcontainer"]/table
		//List<WebElement> table=driver.findElements(By.xpath("*[@id=\"leftcontainer\"]/table"));
		//List<WebElement> table=driver.findElements(By.className("dataTable"));
		for (WebElement aa : table) 
		{
			System.out.println(aa.getText());
		}


	}

}
