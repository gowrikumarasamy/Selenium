package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Letcode_drop 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement from = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0, 100)");
		WebElement to = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).build().perform();
		
  }
}
