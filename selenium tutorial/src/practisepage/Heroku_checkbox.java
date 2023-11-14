package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_checkbox 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement cb = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]"));
	  cb.click();////*[@id="checkboxes"]
	  Thread.sleep(2000);
	  
	  

	}

}
