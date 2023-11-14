package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode_radio_check 
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("yes")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("two")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("nobug")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("foo")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("notG")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0, 100)");
	    driver.findElement(By.xpath("//*[text()=' Remember me ']")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[text()=' I agree to the ']")).click();
	    Thread.sleep(5000);

		

	}

}
