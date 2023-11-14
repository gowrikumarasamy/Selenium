package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demoqa_selectmenu 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);	
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]"));
		Select dd = new Select(drop);
		dd.selectByVisibleText("Group1,option1");
		Thread.sleep(2000);



	}

}
