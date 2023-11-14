package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testkru_buttons 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.testkru.com/Elements/Buttons");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions a = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("//button[@name='doubleClick']"));
		a.doubleClick(dc).perform();
		Thread.sleep(2000);
		
		WebElement rc = driver.findElement(By.xpath("//button[@name='rightClick']"));
		a.contextClick(rc).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@name='leftClick']")).click();
		Thread.sleep(2000);
		
		WebElement color = driver.findElement(By.xpath("//button[@name='colorChangeOnHover']"));
		a.moveToElement(color).perform();
		Thread.sleep(2000);
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@name='openNewTab']"));
		Thread.sleep(2000);*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		

	}

}
