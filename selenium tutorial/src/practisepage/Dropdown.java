package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
  public static void main(String[] args) throws InterruptedException 
  {

		/*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");*/	// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getTitle());
      //driver.findElement(By.xpath("id=dropdown-class-example"));
      WebElement drop = driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
      Select dd = new Select(drop);
      dd.selectByVisibleText("Option1");
      Thread.sleep(2000);
      
      
      
      
	}

}

