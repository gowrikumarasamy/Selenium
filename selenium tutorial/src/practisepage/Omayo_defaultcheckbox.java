package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_defaultcheckbox 
{
  public static void main(String[] args) 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 300)");
	/* WebElement cb = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	  if(cb.isSelected())
	  {
		  System.out.println("checkbox is already selected");
	  }
	  else
	  {
		  System.out.println("checkbox has been selected");
	  }*/
	  driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

	}

}
