package practisepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Heroku_dropdown 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dropdown");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement dd = driver.findElement(By.xpath("//SELECT[@id='dropdown']"));
	  Select drop = new Select(dd);
	  drop.selectByVisibleText("Option 1");
	  Thread.sleep(2000);
	  List<WebElement> al = drop.getOptions();
	  for(WebElement s : al)
	  {
		  System.out.println(s.getText());
	  }
	  
	  
	  

	}

}
