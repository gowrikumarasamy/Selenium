package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waytoautomation_form 
{
 public static void main(String[] args) throws InterruptedException 
 {
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
   driver.manage().window().maximize();
   System.out.println(driver.getCurrentUrl());
   System.out.println(driver.getTitle());
   WebElement fn = driver.findElement(By.xpath("//label[text()='First Name:']"));
   fn.sendKeys("rama");
   WebElement ln = driver.findElement(By.xpath("//label[text()='Last Name:']"));
   ln.sendKeys("chandra");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//label[text()=' Married']")).click();
   Thread.sleep(3000);
   
   
   
 }
}
