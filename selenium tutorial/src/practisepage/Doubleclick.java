package practisepage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Actions a = new Actions(driver);
	WebElement dc = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	a.doubleClick(dc).perform();
	
	Thread.sleep(1000);
	Alert alt = driver.switchTo().alert();
	System.out.println("Double Click Alert message is \n " + alt.getText());
	alt.accept();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
}
  
}
