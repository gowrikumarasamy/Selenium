package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_slider 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/horizontal_slider");
     driver.manage().window().maximize();
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
     WebElement slide = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
     Thread.sleep(3000);
     for(int i = 0;i <=5;i++)
     {
    	 slide.sendKeys(Keys.ARROW_RIGHT);
     }
     Thread.sleep(3000);
     for(int i = 5;i>=0;i--)
     {
    	 slide.sendKeys(Keys.ARROW_LEFT);
    	 
     }
}
}
