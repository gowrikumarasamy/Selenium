package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_notification 
{
 public static void main(String[] args)
 {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
     driver.manage().window().maximize();
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
     driver.findElement(By.xpath("//a[text()='Click here']")).click();
}
}
