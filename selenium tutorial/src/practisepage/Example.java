package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	//driver.get("https://www.youtube.com/watch?v=LxLf3G00DyM");
	driver.get("https://www.youtube.com/watch?v=EnhS3matIoU");
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("document.getElementById(\"video\").play()");
    Thread.sleep(2000); 
    /*js.executeScript("document.getElementById(\"video\").pause()");
    Thread.sleep(2000);
    js.executeScript("document.getElementById(\"video\").load()");
    Thread.sleep(2000);
    js.executeScript("document.getElementById(\"video\").play()");
    Thread.sleep(2000);*/
   }

}
