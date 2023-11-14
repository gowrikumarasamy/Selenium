package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rahulshetty_checkbox 
{
  public static void main(String[] args) throws InterruptedException
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement cb1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		cb1.click();
		Thread.sleep(3000);
		WebElement cb2 = driver.findElement(By.id("checkBoxOption2"));
		cb2.click();
		Thread.sleep(3000);
		WebElement cb3 = driver.findElement(By.name("checkBoxOption3"));
		cb3.click();

	}

}
