package practisepage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick 
{
  public static void main(String[] args)throws Exception 
  {
	  /*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement mouse = driver.findElement(By.xpath("//span[text()='right click me']"));//span[text()='right click me']
		Actions a = new Actions(driver);
		a.contextClick(mouse).build().perform();
		Thread.sleep(3000);
		
		WebElement mouse1 = driver.findElement(By.xpath("//span[text()='Delete']"));
		a.click(mouse1).build().perform();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println("Right Click Alert message is \n " + alt.getText());
		alt.accept();
		
		
		/*WebDriverWait wb = new WebDriverWait(driver,Duration.ofSeconds(30));
		wb.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		WebElement mouse2 = driver.findElement(By.xpath(getText()));*/
		
		/*WebElement python = driver.findElement(By.xpath("//a[text() = 'Python']"));
		Thread.sleep(3000);
		a.perform();
		Thread.sleep(3000);
		System.out.println("Right clicked successfully on context menu");
		Alert alt = driver.switchTo().alert();
		Thread.sleep(4000);
		String getText = alt.getText();
		System.out.println("Displayed text on alert: " + alt.getText());
		alt.accept();*/	
	}

private static String getText() {
	// TODO Auto-generated method stub
	return null;
}

}
