package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login1 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//input[@id='txt_unam']")).sendKeys("sylix");
	  driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='Button3']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
  }
  
  @BeforeClass
  public void beforeClass()throws Exception
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
