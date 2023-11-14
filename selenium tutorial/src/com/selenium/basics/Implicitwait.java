package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait 
{
  public static void main(String[] args) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement createaccount = driver.findElement(By.partialLinkText("Crea"));
	  createaccount.click();
	  WebElement firstname = driver.findElement(By.name("firstname"));
	  firstname.sendKeys("tester");
	  WebElement surname = driver.findElement(By.name("lastname"));
	  surname.sendKeys("professional");
	  WebElement email = driver.findElement(By.name("reg_email__"));
	  email.sendKeys("testingproff@mail.com");
	  WebElement re_enter = driver.findElement(By.name("reg_email_confirmation__"));
	  re_enter.sendKeys("testingproff@mail.com");
	  WebElement password = driver.findElement(By.id("password_step_input"));
	  password.sendKeys("testerblood");
	  WebElement gender = driver.findElement(By.name("sex"));
	  gender.click();
	  

	}

}
