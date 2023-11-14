package practisepage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_webtable 
{
  public static void main(String[] args) 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		WebElement fn = driver.findElement(By.xpath("//input[@id='firstName']"));
		fn.sendKeys("info");
		WebElement ln = driver.findElement(By.xpath("//input[@id='lastName']"));
		ln.sendKeys("mats");///html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input
		WebElement email = driver.findElement(By.xpath("//INPUT[@id='userEmail']"));
		email.sendKeys("infomats@mail.com");
		WebElement age = driver.findElement(By.xpath("//INPUT[@id='age']"));
		age.sendKeys("12");
		WebElement sal = driver.findElement(By.xpath("//INPUT[@id='salary']"));
		sal.sendKeys("36500");
		WebElement dept = driver.findElement(By.xpath("//INPUT[@id='department']"));
		dept.sendKeys("testing");
		driver.findElement(By.xpath("//BUTTON[@id='submit']")).click();
		List<WebElement> table = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]"));
		for(WebElement aa : table)
		{
			System.out.println(aa.getText());
		}
		
		
		
	}

}
