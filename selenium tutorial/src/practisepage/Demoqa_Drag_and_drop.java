package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demoqa_Drag_and_drop 
{
  public static void main(String[] args) throws Exception  
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/droppable/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    //driver.switchTo().frame(0);
	   WebElement from = driver.findElement(By.id("draggable"));
	    Thread.sleep(2000);
	    WebElement to = driver.findElement(By.id("droppable"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(from, to).build().perform();
	    
	     /*  driver.findElement(By.linkText("Accept")).click();
	    Thread.sleep(3000);
	    //*[@id='acceptable']
	   WebElement from1 = driver.findElement(By.id("acceptable"));
	    Thread.sleep(2000);
	    WebElement to1 = driver.findElement(By.id("//*[@id=\"droppable\"]"));
	    Thread.sleep(2000);
	    //*[@id="droppable"] /html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]
	    Actions a1 = new Actions(driver);
	    a1.dragAndDrop(from1, to1).build().perform();*/

	}

}
