package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_tooltip 
{
  public static void main(String[] args) throws InterruptedException 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Actions a = new Actions(driver);
	WebElement hov = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
	a.moveToElement(hov).perform();
	Thread.sleep(5000);
	WebElement hov1 = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
	a.moveToElement(hov1).perform();
	hov1.sendKeys("gowri");
	Thread.sleep(5000);
	
	

	}

}
