 package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Blogspot_mousehover 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://only-testing-blog.blogspot.com/2015/03/chart.html");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  
	  Actions a = new Actions(driver);
	  WebElement hov = driver.findElement(By.xpath("//*[text()='Hover over me']"));
	  a.moveToElement(hov).build().perform();
	  Thread.sleep(3000);
	  
	  WebElement name = driver.findElement(By.xpath("//input[@id='tooltip-1']"));
	  name.sendKeys("gowri");
	  WebElement sur = driver.findElement(By.xpath("//input[@id='sname']"));
	  sur.sendKeys("gayathri");
	  WebElement add = driver.findElement(By.xpath("//input[@id='yaddress']"));
	  add.sendKeys("chennai");
	  
	  
	  
	  
	 
  }
}
