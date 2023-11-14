package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omayo_doubleclick 
{ 
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 1800)");
	  WebElement dc = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));////button[text()=' Double click Here   ']
	  Actions a = new Actions(driver);
	  a.doubleClick(dc).build().perform();
	  Thread.sleep(3000);
	  Alert alt = driver.switchTo().alert();
	  System.out.println("the alert message is: " + alt.getText());
	  alt.accept();
	  
 }

}
