package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa_slider 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
       driver.get("https://demoqa.com/slider");
   //	driver.switchTo().frame(0);
       driver.manage().window().maximize();
     WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
     
     Thread.sleep(5000);
     for(int i = 25;i <=100;i++)
     {
    	slider.sendKeys(Keys.ARROW_RIGHT);
     }
     Thread.sleep(2000);
      for(int i = 100;i >=30;i--)
      {
    	slider.sendKeys(Keys.ARROW_LEFT);  
      }
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
	}

  
}
