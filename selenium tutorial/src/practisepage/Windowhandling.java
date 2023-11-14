package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling 
{
  public static void main(String[] args) 
  {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().window().maximize();
    String parent = driver.getWindowHandle();
    driver.findElement(By.xpath("//button[@id='openwindow']"));
   

	}

}
