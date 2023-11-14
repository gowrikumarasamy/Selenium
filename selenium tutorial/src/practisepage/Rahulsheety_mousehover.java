package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Rahulsheety_mousehover 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
      driver.manage().window().maximize();
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getTitle());
      Actions a = new Actions(driver);
       WebElement hov= driver.findElement(By.xpath("//button[@id='mousehover']"));
      a.moveToElement(hov).build().perform();
      Thread.sleep(3000);
      
      WebElement top = driver.findElement(By.xpath("//a[text()='Top']"));
      a.moveToElement(top).perform();
      top.click();
      Thread.sleep(2000);
      
      js.executeScript("window.scrollBy(0,900)");
      
      WebElement hov1 = driver.findElement(By.xpath("//button[@id='mousehover']"));
      a.moveToElement(hov1).build().perform();
      Thread.sleep(3000);
      
    
      WebElement reload = driver.findElement(By.xpath("//a[text()='Reload']"));
       a.moveToElement(reload).perform();
      reload.click();
      Thread.sleep(2000);
     // Thread.sleep(3000);
      }

}
