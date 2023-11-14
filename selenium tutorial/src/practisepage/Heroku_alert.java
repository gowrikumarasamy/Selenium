package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_alert 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	
	Alert alt = driver.switchTo().alert();
	System.out.println("the alert message is: " + alt.getText());
	Thread.sleep(3000);
	alt.accept();
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Thread.sleep(3000);
	alt.accept();
	WebElement pa = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	pa.sendKeys("rama");
	pa.click();
	Thread.sleep(3000);
	alt.accept();
	
  }
}
