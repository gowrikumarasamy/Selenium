package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dhow%2Bto%2Bcreate%2Ba%2Bgmail%2Baccount%26oq%3Dhow%2Bto%2Bcreate%2Ba%2Bgmail%26aqs%3Dchrome.0.0i512j69i57j0i512l8.8633j0j15%26sourceid%3Dchrome%26ie%3DUTF-8&hl=en&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.manage().window().maximize();
	//driver.findElement(By.partialLinkText("Sign")).click();
	//driver.findElement(By.partialLinkText("Use")).click();
	//driver.findElement(By.id("identifierId")).sendKeys("gowri");
	//driver.findElement(By.partialLinkText("Crea")).click();
	WebElement fn = driver.findElement(By.id("firstName"));
	fn.sendKeys("mymail");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("rights");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("gowrikumarasamy7171");
	driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("admin212");
	driver.findElement(By.name("ConfirmPasswd")).sendKeys("admin212");
	driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	

	}

}
