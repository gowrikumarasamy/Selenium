package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_getprompt 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 500)");
	  driver.findElement(By.xpath("//input[@id='prompt']")).click();
	  Alert pr1 = driver.switchTo().alert();
	  System.out.println("prompt alert is: " +pr1.getText());
	  
	  //Thread.sleep(3000);
	  
	  pr1.sendKeys("india");
	  Thread.sleep(3000);
	  pr1.accept();
	 /* js.executeScript("window.scrollBy(0, 550)");
	  driver.findElement(By.name("textboxn"));////input[@name='textboxn']*/
	  

	}

}
