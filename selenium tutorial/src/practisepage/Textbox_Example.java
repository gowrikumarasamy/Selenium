package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_Example 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://artoftesting.com/samplesiteforselenium");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	//driver.findElement(By.xpath("//input[@id='fname']"));
	driver.findElement(By.xpath("//*[@id=\'fname\']")).sendKeys("gowri");
	

	}

}
