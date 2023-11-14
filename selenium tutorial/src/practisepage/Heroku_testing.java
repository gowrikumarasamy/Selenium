package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Heroku_testing 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());	  
	  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\DELL\\Downloads\\Selenium WebDriver Tutorial Quick Links.docx");
	  driver.findElement(By.id("file-submit")).click();
	  /*WebElement dd = driver.findElement(By.xpath("//SELECT[@id='dropdown']"));
	  Select drop = new Select(dd);
	  drop.selectByVisibleText("Option 1");
	  Thread.sleep(2000);*/
	  
	  
  }
}

