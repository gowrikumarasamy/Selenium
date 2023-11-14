package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;

public class Css_Selectornew 
{
  public static void main(String[] args) 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(opt);
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  WebElement email = driver.findElement(By.cssSelector("input[id=email]"));
	  email.sendKeys("gayukumarasamy@gmail.com");
	 WebElement pass = driver.findElement(By.cssSelector("input[type=password]"));
	 pass.sendKeys("gayathri@13");
	WebElement loginbtn = driver.findElement(By.name("login"));
	 loginbtn.click();
	 /*ChromeOptions opt = new ChromeOptions();
	 opt.addArguments("disable-notifications");
	 WebDriver driver1 = new ChromeDriver(opt);*/
	}

}
