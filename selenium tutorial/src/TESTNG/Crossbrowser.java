package TESTNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser
{
WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
		@Test(priority = -1,description = "This test for printing webpage title")
		public void printTitle()
		{
			System.out.println(driver.getTitle());
		}
		
		@Test(priority = 0)
		public void printURL()
		{
			System.out.println(driver.getCurrentUrl());
		}
		
		@Test(priority = 1)
		public void printLinksCount()
		{
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
		}
		@Parameters("3")
		@Test(priority = 2)
		public void printLinks(String locator)
		{
			List<WebElement> links = driver.findElements(By.tagName(locator));
			
			for (WebElement aa : links) {
				System.out.println(aa.getText());
			}
		}
		
		@Parameters({"1","2"})
		@Test(priority = 3)
		public void verifyLogin(String userName,String passWord)
		{
			driver.findElement(By.id("email")).sendKeys(userName);
			driver.findElement(By.id("pass")).sendKeys(passWord);
		}
	
  }

