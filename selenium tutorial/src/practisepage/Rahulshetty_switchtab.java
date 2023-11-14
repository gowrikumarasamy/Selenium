package practisepage;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rahulshetty_switchtab 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		((JavascriptExecutor)driver).executeScript("window.open()");
		 ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tab2.get(1));
		 driver.get("https://www.rahulshettyacademy.com/");
		  Thread.sleep(3000);


	}

}
