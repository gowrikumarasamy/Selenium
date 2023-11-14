package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoqa_radiobutton 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		Thread.sleep(3000);
//		WebElement YesRad = driver.findElement(By.xpath("//input[@id='yesRadio'][1]"));
//		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wb.until(ExpectedConditions.elementToBeClickable(YesRad));
//		System.out.println(YesRad.isDisplayed());
//		System.out.println(YesRad.isEnabled());
//		System.out.println(YesRad.isSelected());
//		YesRad.click();
//		System.out.println(YesRad.isSelected());
		driver.findElement(By.xpath("//label[text()='Impressive']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//label[text()='No']")).click();
		driver.findElement(By.xpath("//input[@id='noRadio']")).click();
	
	}

}
