package TESTNG;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Groups 
{
	WebDriver driver;
  @Test(groups = "sanity")
  public void printtitle() 
  {
	  System.out.println(driver.getTitle());
  }
  @Test(groups = "smoke")
  public void printurl()
  {
	  System.out.println(driver.getCurrentUrl());
  }
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

}
