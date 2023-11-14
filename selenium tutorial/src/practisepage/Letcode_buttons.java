package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode_buttons 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='position']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='color']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='property']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Button Hold!']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

}
