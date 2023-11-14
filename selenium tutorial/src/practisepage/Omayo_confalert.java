package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_confalert 
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
	  //Alert alt = driver.switchTo().alert();
	driver.findElement(By.xpath("//input[@id='confirm']")).click();
	Alert alt = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println("alert message is: " + alt.getText());
	alt.accept();
	  
			  

	}

}
