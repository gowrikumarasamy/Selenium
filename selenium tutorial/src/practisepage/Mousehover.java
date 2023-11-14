package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mousehover 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement mouse = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouse).build().perform();
		WebElement mouse1 = driver.findElement(By.xpath("//div[text()='Jobs in Chennai']"));
		a.click(mouse1).build().perform();
	    Thread.sleep(5000);

	}

}
