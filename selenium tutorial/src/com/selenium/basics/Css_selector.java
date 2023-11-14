package com.selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Css_selector 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();
		/*driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("gowri");
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-2']")).sendKeys("kumarasamy");
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-3']")).sendKeys("145236");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("india");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("chennai");
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-6']")).sendKeys("gayukumarasamy@gmail.com");*/
		/*WebElement option2 = driver.findElement(By.xpath("//label[text() = 'Female']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
		wb.until(ExpectedConditions.elementToBeClickable(option2));
		option2.click();*/
		
		//driver.findElement(By.id("RESULT_FileUpload-10")).sendKeys("C:\\Users\\DELL\\Documents\\Java questions set 5.docx");

		WebElement drop=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
		drop.click();
		Select s=new Select(drop);
		s.selectByIndex(2);
	 }
}


