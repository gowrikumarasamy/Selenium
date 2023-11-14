package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blogspot_login 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://only-testing-blog.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 4800)");
	  driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("gowri");
	  driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("admin@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-body-4024384759750876807\"]/div[1]/form/input[5]")).sendKeys("gowri");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-body-4024384759750876807\"]/div[1]/form/input[6]")).sendKeys("kumarasamy");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@onclick='check(this.form)']")).click();
	  Alert alt = driver.switchTo().alert();
	  Thread.sleep(2000);
	  System.out.println("the alert message is: " + alt.getText());
	  alt.accept();
	  Thread.sleep(5000);
	  alt.accept();
	 // js.executeScript("window.scrollBy(0, 500)");
	  
}
}
