package TESTNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion 
{
	//Assert -----> Hard Assert, SoftAssert
	
		//Hard Assert breaks the code immediately
		
		//Soft Assert allows to proceed next lines of the method
		
		//Hard Assert derive from Assert Class(static)
		
		//Soft Assert derive from SoftAssert class(Instance)
		

		WebDriver driver;
		
		SoftAssert softAssert; //softassert declared as global
		@BeforeClass
		public void browserSetup()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		@AfterClass
		public void tearDown()
		{
			driver.manage().deleteAllCookies();
			driver.close();
		}
  @Test
  public void dprintWebPageTitle()
  {
	  System.out.println(driver.getTitle());
  }
  @Test()
	public void bprintWebPageUrl()
	{
		System.out.println(driver.getCurrentUrl());
	}
  
  @Test()
	public void aprintWebPageLinksCount()
	{
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
  
  @Test()
	public void printWebPageLinks()
	{
		int expectedLinksCount=100;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int actualLinksCount =links.size();
		Assert.assertEquals(actualLinksCount, expectedLinksCount);
		/*
		 * Here we used hard assert, if it got mismatch with expected and actual code
		 * will not move to next line so links will not print
		 */
		for (WebElement aa : links) 
		{
			System.out.println(aa.getText()+"----->"+aa.getAttribute("href"));
		}
	}
		
		@Test()
		public void printWebPageLinkswithSoftAssert()
		{
			int expectedLinksCount=100;
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int actualLinksCount =links.size();
			/*
			 * for softassert we want to create object for softassert class then on last
			 * line of the method we want use assertall method
			 */
			softAssert=new SoftAssert();
			softAssert.assertEquals(actualLinksCount, expectedLinksCount);
			/*
			 * Here we used soft assert, if it got mismatch with expected and actual code
			 * will move to next line so links will print
			 */
			for (WebElement aa : links) 
			{
				System.out.println(aa.getText()+"----->"+aa.getAttribute("href"));
			}
			softAssert.assertAll();
		}
		@Test(priority = 1)
		public void verifyLogin()
		{
			driver.findElement(By.id("email")).sendKeys("admin@mail.com");
			driver.findElement(By.id("pass")).sendKeys("admin@123");
		}
		
		@Test(priority = 2)
		public void verifyCreateAccount()
		{
			driver.findElement(By.partialLinkText("Crea")).click();
		}
		
		@Test(priority = 3)
		public void verifyCreation()
		{
			driver.findElement(By.name("firstname")).sendKeys("admin");
		}
		
	}