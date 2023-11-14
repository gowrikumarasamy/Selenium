package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulshetty_display 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("gowri");
	Thread.sleep(5000);

	}

}
