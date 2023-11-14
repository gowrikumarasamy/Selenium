package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Tutorialpoint_practice 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	driver.manage().window().maximize();
	//driver.findElement(By.id("banner-accept")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("gowri");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumarasamy");
	WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
	female.click();
    WebElement yoe4 = driver.findElement(By.xpath("//input[@value='3']"));
	yoe4.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	WebElement date = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[5]/td[2]/input"));
	date.sendKeys("10.03.2023");
	driver.findElement(By.xpath("//input[@name='photo']")).sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot (13).png");
	WebElement proff = driver.findElement(By.name("profession"));
	proff.click();
	WebElement proff1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[6]/td[2]/span[2]/input"));
	proff1.click();
	WebElement cont = driver.findElement(By.name("continents"));
	Select select = new Select(cont);
	select.selectByVisibleText("Africa");
	Thread.sleep(3000);
	//select.selectByValue("Africa");
	//Thread.sleep(3000);
	select.selectByIndex(2);
	Thread.sleep(3000);
	WebElement btn = driver.findElement(By.xpath("//button[@name='submit']"));
	btn.click();
	Thread.sleep(3000);
	Alert alt = driver.switchTo().alert();
	System.out.println("the alert message is: " + alt.getText());
	alt.accept();
	WebElement com = driver.findElement(By.xpath("//button[@id='dynamicColor']"));
	com.click();
	Thread.sleep(3000);
	
	
	
	
	
	
	

	}

}
