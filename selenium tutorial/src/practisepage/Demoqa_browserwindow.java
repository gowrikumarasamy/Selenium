package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_browserwindow 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		Thread.sleep(3000);

	}

}
