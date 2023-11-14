package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testkru_drag_drop 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/drag.xhtml");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());	
	  Actions a = new Actions(driver);
	  WebElement drag = driver.findElement(By.xpath("//p[text()='Drag to target']"));
	  Thread.sleep(3000);
	  WebElement drop = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
	  Thread.sleep(3000);
	  a.dragAndDrop(drag, drop).perform();
	  
}
}
