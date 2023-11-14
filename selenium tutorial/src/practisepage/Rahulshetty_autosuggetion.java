package practisepage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rahulshetty_autosuggetion 
{
  public static void main(String[] args) 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	 // driver.findElement(By.id("autocomplete")).sendKeys("hon");
	  driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("hon");
	  List<WebElement> country = driver.findElements(By.xpath("/html/body/ul/li"));///html/body/ul/li[2]/div
	  ///html/body/ul/li[2]/div ///html/body/ul/li/div
	  System.out.println(country.size());
	  for(WebElement a : country)
	  {
		  System.out.println(a.getText());
	  }
	  for(WebElement b : country)
	  {
		  if(b.getText().startsWith("Hong"))//if(b.getText().equalIgnorancecase("hong kong"))
		  {
			  b.click();
			  //break;
		  }
	  }
	  
     }
  }
	  
	  // TODO Auto-generated method stub



