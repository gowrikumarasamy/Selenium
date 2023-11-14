package com.selenium.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Auto_suggetion 
{
  public static void main(String[] args) throws ParseException 
  {
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.hyrtutorials.com/p/calandar-practice.html");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 driver.manage().window().maximize();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 String date = "28/02/2024";
	 SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 
	 Date dateformat = targetDateFormat.parse(date);
	 System.out.println(dateformat);
	 
	 
	 

	}

}
