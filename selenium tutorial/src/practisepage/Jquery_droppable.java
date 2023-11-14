package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_droppable
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		WebElement from = driver.findElement(By.xpath("//*[@id='draggable']"));
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//*[@id='droppable']"));
		//Thread.sleep(2000);
		Actions a = new Actions(driver);
	a.dragAndDrop(from, to).perform();
	

	}

}
