package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_multiplecheck 
{
  public static void main(String[] args) 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 1700)");
	  driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[3]")).click();
	  driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[4]")).click();
	}

}
