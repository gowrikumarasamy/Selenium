package com.selenium.basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications"); 
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.get("https:www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.partialLinkText("Crea")).click();
	 WebElement firstname = driver.findElement(By.name("firstname"));
	 firstname.sendKeys("gayu");
	 WebElement lastname = driver.findElement(By.name("lastname"));
	 lastname.sendKeys("kumarasamy");
	 WebElement email = driver.findElement(By.name("reg_email__"));
	 email.sendKeys("gayukumarasamy@gmail.com");
	 WebElement con = driver.findElement(By.name("reg_email_confirmation__"));
			 con.sendKeys("gayukumarasamy@gmail.com");
	 WebElement password = driver.findElement(By.name("reg_passwd__"));
	 password.sendKeys("gayathri@13");
	 WebElement day = driver.findElement(By.id("day"));
	 Select daydrop = new Select(day);
	 daydrop.selectByIndex(3);
	 Thread.sleep(2000);
	 daydrop.selectByValue("20");
	 Thread.sleep(2000);
	 daydrop.selectByVisibleText("13");
	 
	 List<WebElement> al = daydrop.getOptions();
	 System.out.println(al.size());
	 Iterator<WebElement> itr = al.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next().getText());
	 }
	 WebElement month = driver.findElement(By.id("month"));
	 Select monthdrop = new Select(month);
	 monthdrop.selectByVisibleText("Jun");
	 Thread.sleep(2000);
	 
	 List<WebElement> al1 = monthdrop.getOptions();
	 System.out.println(al1.size());
	 for(WebElement a : al1)
	 {
		 System.out.println(a.getText());
	 }
	 
	 WebElement year = driver.findElement(By.id("year"));
	 Select yeardrop = new Select(year);
	 yeardrop.selectByVisibleText("1990");
	 Thread.sleep(2000);
	 
	 List<WebElement> al2 = yeardrop.getOptions();
	 System.out.println(al2.size());
	 
	 for(WebElement s : al2)
	 {
		 System.out.println(s.getText());
	 }
	 
	 WebElement gender = driver.findElement(By.name("sex"));
	 gender.click();
	 
	  driver.findElement(By.name("websubmit")).click();//signup
	}

}
