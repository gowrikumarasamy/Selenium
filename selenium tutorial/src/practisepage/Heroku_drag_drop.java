package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Heroku_drag_drop 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    Actions a = new Actions(driver);
	  WebElement from =  driver.findElement(By.xpath("//*[@id='column-a']"));
	  Thread.sleep(2000);
	  WebElement to = driver.findElement(By.xpath("//*[@id='column-b']"));
	  Thread.sleep(3000);
	  a.dragAndDrop(from, to).perform();
	    
	    
	    
}
	
}
