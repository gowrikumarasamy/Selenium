package practisepage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtab 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/fieldset/a")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String parent=driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB).getWindowHandle();
	Set<String> child=driver.getWindowHandles();
	
	//driver.switchTo().window(parent);
	// TODO Auto-generated method stub

	}

}
