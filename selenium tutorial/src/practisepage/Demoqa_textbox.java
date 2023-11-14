package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa_textbox 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	WebElement fun = driver.findElement(By.id("userName"));//input[@id='userName']
	fun.sendKeys("adolf hitler");
	Thread.sleep(2000);
	WebElement lan = driver.findElement(By.id("userEmail"));
	lan.sendKeys("hitlersoft@mail.com");
	Thread.sleep(2000);
	WebElement ca = driver.findElement(By.id("currentAddress"));
	ca.sendKeys("485, hitler street,germany");
	Thread.sleep(2000);
    WebElement pa = driver.findElement(By.id("permanentAddress"));
    pa.sendKeys("485, hitler street,germany");
    Thread.sleep(5000);
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,500)");
    WebElement btn = driver.findElement(By.id("submit"));
    btn.click();
    
	}

}
