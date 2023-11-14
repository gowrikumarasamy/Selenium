package TESTNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class Sample 
{
	WebDriver driver;
  @Test(invocationCount = 10,timeOut = 300,alwaysRun = true)
  public void printtitle() 
  {
	  System.out.println(driver.getTitle());
  }
  @Test(dependsOnMethods = "printtitle",description = "title",groups = "urlfroup")
  public void printurl()
  {
	  System.out.println(driver.getCurrentUrl());
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		driver = new ChromeDriver();
		driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		Thread.sleep(5000);
		driver.manage().window().maximize();
  }

}
