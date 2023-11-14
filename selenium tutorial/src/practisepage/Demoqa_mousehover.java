package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_mousehover 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    //Thread.sleep(5000);
	    Actions a = new Actions(driver);
	    WebElement submenu1 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	    a.moveToElement(submenu1).perform();
	    Thread.sleep(3000);
	    WebElement submenu2 = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	    a.moveToElement(submenu2).perform();
	    Thread.sleep(3000);
        WebElement submenu3 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
        a.moveToElement(submenu3).perform();
        Thread.sleep(3000);
        WebElement submenu4 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
        a.moveToElement(submenu4).perform();
        Thread.sleep(3000);
        
	}

}
