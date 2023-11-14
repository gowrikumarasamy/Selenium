package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_dynamicproperties 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("/button[@id='enableAfter']"));
//		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//button[@id='colorChange']"));
		Thread.sleep(3000);

	}

}
