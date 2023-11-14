package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_modals 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/modal-dialogs");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  /*JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 500)");*/
	  driver.findElement(By.xpath("//button[@id='showSmallModal']")).click();
	  Thread.sleep(3000);
	  Alert alt = driver.switchTo().alert();
	  System.out.println("alert message is: " + alt.getText());
	  alt.accept();

	}

}
