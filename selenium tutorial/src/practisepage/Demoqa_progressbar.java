package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoqa_progressbar
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver(
				);
		driver.get("https://demoqa.com/progress-bar");
		driver.manage().window().maximize();
		driver.findElement(By.id("progressBar"));
		driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		Thread.sleep(2000);
		WebElement pb = driver.findElement(By.xpath("//div[@role='progressbar']"));
		//driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		boolean progressStatus = wait.until(ExpectedConditions.attributeToBe(pb, "aria-valuenow", "100"));
		if(progressStatus==true)
		{
          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetButton']"))).click();
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
