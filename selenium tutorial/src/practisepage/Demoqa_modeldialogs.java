package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_modeldialogs 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/modal-dialogs");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//button[@id='showSmallModal']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='showLargeModal']")).click();
	Thread.sleep(3000);

	}

}
