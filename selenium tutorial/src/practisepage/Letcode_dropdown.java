package practisepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcode_dropdown 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement fruit = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select fruitdrop = new Select(fruit);
		fruitdrop.selectByIndex(2);
		Thread.sleep(3000);
		fruitdrop.selectByVisibleText("Orange");
		Thread.sleep(3000);
		List<WebElement> al = fruitdrop.getOptions();
		System.out.println(al.size());
		for(WebElement aa : al)
		{
			System.out.println(aa.getText());
		}
		
		
		

	}

}
