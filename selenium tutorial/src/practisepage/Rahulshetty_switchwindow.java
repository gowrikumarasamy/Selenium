package practisepage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rahulshetty_switchwindow 
{
  public static void main(String[] args) 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\\\chromedriver.exe");*/	// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      System.out.println("https://rahulshettyacademy.com/AutomationPractice/");
   // Store the current window handle
     //String currentWindowHandle = driver.getWindowHandle();

     // Find the link that opens a new window and click it
      WebElement link = driver.findElement(By.linkText("Open Window"));
      link.click();
      String parentwindow = driver.getWindowHandle();
      driver.findElement(By.id("openwindow")).click();
      Set<String> childwindow = driver.getWindowHandles();
      ArrayList<String> list = new ArrayList(childwindow);
      driver.switchTo().window(list.get(1));
      
      
      

      // Wait for the new window or tab to open
      /*WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.numberOfWindowsToBe(2));*/

      // Switch to the new window or tab
     /* Set<String> windowHandles = driver.getWindowHandles();
      for (String handle : windowHandles) 
      {
          if (!handle.equals(currentWindowHandle)) 
          {
              driver.switchTo().window(handle);
              break;
          }
      }*/

      // Perform actions on the new window or tab
     // WebElement element = driver.findElement(By.id("element-id"));
      //element.click();

      // Switch back to the original window or tab
     // driver.switchTo().window(currentWindowHandle);
  }
}
