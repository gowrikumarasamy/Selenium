package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_double_right_click 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	Actions a = new Actions(driver);
	WebElement dc = driver.findElement(By.id("doubleClickBtn"));
	a.doubleClick(dc).perform();
	Thread.sleep(3000);
	WebElement rc = driver.findElement(By.id("rightClickBtn"));////button[@id='rightClickBtn']
	a.contextClick(rc).perform();
	Thread.sleep(3000);
	
	/*WebElement clk = driver.findElement(By.xpath("Click Me"));
	a.click(clk).perform();
	Thread.sleep(3000);*/
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
	//Thread.sleep(3000);)
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	}

}
