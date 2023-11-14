package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Omayo_dropdown 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 1800)");
	  driver.findElement(By.xpath("//BUTTON[text()='Dropdown']")).click();
	  Thread.sleep(3000);
	  WebElement fk = driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/a[2]"));
	  ////*[@id="myDropdown"]/a[2]
	  Select fkdrop = new Select(fk);
	  fkdrop.selectByVisibleText("Flipkart");

	}

}
