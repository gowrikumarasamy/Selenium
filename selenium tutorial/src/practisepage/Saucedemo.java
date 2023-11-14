package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saucedemo 
{
  public static void main(String[] args) 
  {
	  ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\\\chromedriver.exe");	// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver(opt);
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    WebElement un = driver.findElement(By.xpath("//input[@id='user-name']"));
    un.sendKeys("standard_user");
    WebElement pw = driver.findElement(By.id("password"));
    pw.sendKeys("secret_sauce");
    WebElement login = driver.findElement(By.id("login-button"));
    login.click();
    
    

	}

}
