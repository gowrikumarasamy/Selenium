package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa_alerthandling 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.id("alertButton")).click();
	Alert alt = driver.switchTo().alert();
	System.out.println("the alert message is:" + alt.getText());
	Thread.sleep(3000);
	alt.accept();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 200)");
	driver.findElement(By.id("timerAlertButton")).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	alt.accept();
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(6000);
	alt.accept();
	WebElement pa = driver.findElement(By.xpath("//button[@id='promtButton']"));
	pa.click();
	Alert  prompt = driver.switchTo().alert();
	System.out.println("prompt alert is: " + prompt.getText());
	prompt.sendKeys("gowri");
	
	//alt.sendKeys("Gowri");
	Thread.sleep(6000);
	prompt.accept();
	/*String text = driver.findElement(By.cssSelector("span#promptResult")).getText();
	System.out.println(text);*/

	}

}
