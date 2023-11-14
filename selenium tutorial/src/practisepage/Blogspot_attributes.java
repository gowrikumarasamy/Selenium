package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blogspot_attributes 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://only-testing-blog.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 6500)");
//	  driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("deepika");
//	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("sri");
//	  Thread.sleep(3000);

	}

}
