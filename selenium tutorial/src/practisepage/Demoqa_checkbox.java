package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa_checkbox 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 /* ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(opt);*/
	  WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id='tree-node-home']")).click();////*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg
    driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg")).click();
	}

}
