 package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login 
{
	WebDriver driver;

	
	//@Parameters({"username","password"})
	@Parameters({"username","password"})

	
  @Test
  public void f(String username,String password) throws Exception//public void f() throws Exception
  {
	  //String baseUrl = "http://www.brm.tremplintech.in/web_pages/login.aspx";
	  driver.findElement(By.xpath("//input[@id='txt_unam']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id='Button3']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
  }
	  @BeforeClass
	  public void beforeClass()throws Exception
	  {
		 /* ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*"); 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
			driver = new ChromeDriver();
			driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
			Thread.sleep(5000);
			driver.manage().window().maximize();
		}
	  @AfterClass
	  public void afterClass()
	  {
		  //driver.close();
	  }
	  
	    }

