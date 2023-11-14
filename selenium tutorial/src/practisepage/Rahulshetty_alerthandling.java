package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rahulshetty_alerthandling 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("name")).sendKeys("gowri");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		a.accept();
		//Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		//Thread.sleep(3000);
        a.accept();
	}

}
