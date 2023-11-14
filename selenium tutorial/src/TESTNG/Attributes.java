package TESTNG;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Attributes 
{
	WebDriver driver;
  @Test(priority = 0,invocationCount = 5,description = "title")
  public void printtitle() 
  {
	  System.out.println(driver.getTitle());
  }
  @Test(timeOut = 13)
  public void printurl()
  {
	  System.out.println(driver.getCurrentUrl());
  }
  @Test(dependsOnMethods = "printurl")
  public void f()
  {
	System.out.println("i am f method");  
  }
  /*@Test(enabled = false)
  public void m()
  {
	  System.out.println("print me");
  }*/
  
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

}
