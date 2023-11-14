package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_draggable 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement from = driver.findElement(By.xpath("//*[@id='draggable']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.clickAndHold(from).moveByOffset(200, 100).release().perform();
		
		
	}

}
