package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_selectable 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement item1 = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		Thread.sleep(2000);
		WebElement item3 = driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
		Thread.sleep(2000);
		WebElement item5 = driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
		Thread.sleep(2000);
		//WebElement item7 = driver.findElement(By.xpath("//*[@id='selectable']/li[7]"));
		//Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.clickAndHold(item1).moveToElement(item5).release().perform();
		

	}

}
