package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode_slider 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/slider");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement slider = driver.findElement(By.xpath("//input[@id='generate']"));
		Thread.sleep(3000);
		for(int i = 1; i <= 50; i++) 
		{
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		driver.findElement(By.xpath("//button[text()='Get Countries']")).click();

	}

}
