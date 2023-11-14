package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_resizeable 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement resizeable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.clickAndHold(resizeable).moveByOffset(100,50).release().perform();

	}

}
