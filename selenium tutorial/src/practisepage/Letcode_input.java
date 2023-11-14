package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode_input 
{
  public static void main(String[] args) 
  {
	  WebDriver driver = new ChromeDriver();
	   driver.get("https://letcode.in/edit");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("gowri kumarasamy");
}
}
