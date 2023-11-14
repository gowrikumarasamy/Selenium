package practisepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulshetty_bigwebtabel 
{
  public static void main(String[] args) 
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,800)");
    List<WebElement> table = driver.findElements(By.xpath("html/body/div[3]/div[1]/fieldset/table"));
    for(WebElement aa : table)
    {
    	System.out.println(aa.getText());
    }
	///html/body/div[3]/div[1]/fieldset/table
  }
}
