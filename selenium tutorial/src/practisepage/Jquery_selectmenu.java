package practisepage;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jquery_selectmenu 
{
  public static void main(String[] args) throws InterruptedException
  {
	    WebDriver driver = new ChromeDriver();
		  driver.get("https://jqueryui.com/selectmenu/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		   driver.switchTo().frame(0);
		WebElement speed= driver.findElement(By.xpath("//span[@class='ui-selectmenu-text'][text()='Medium']"));
//		WebElement slow= driver.findElement(By.xpath("//div[@id='ui-id-2']"));
//		slow.click();
		 Select slowmo = new Select(speed);
//		 slowmo.selectByIndex(1);
//		 Thread.sleep(2000);
		 slowmo.selectByVisibleText("Slow");
		 Thread.sleep(2000);
	}
}
