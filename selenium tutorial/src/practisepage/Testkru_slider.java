package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testkru_slider 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/drag.xhtml");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());	
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 7000)");//scrollup
		Thread.sleep(6000);
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
		for(int i = 80;i<=100;i++)
		{
			slide.sendKeys(Keys.ARROW_RIGHT);
		}
		Thread.sleep(3000);
		for(int i =30;i>=10;i--)
		{
			slide.sendKeys(Keys.ARROW_LEFT);
		}

	}

}
