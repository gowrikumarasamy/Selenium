package practisepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationhandling 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  
	 ChromeOptions opt = new ChromeOptions();
	 opt.addArguments("--remote-allow-origins=*"); 
	  //opt.addArguments("disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.navigate().to("https://www.redbus.in//");
	 
	  driver.navigate().to("https://www.google.com//");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().to("https://irctc.in//");
	  Thread.sleep(1000);
	  driver.navigate().refresh();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());

	}

}
