package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waytoautomation_alert 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("/html/body/button")).click();
	Alert alt = driver.switchTo().alert();
	Thread.sleep(3000);
	alt.accept();
	System.out.println("the alert message is: " + alt.getText());
	
  }
}
