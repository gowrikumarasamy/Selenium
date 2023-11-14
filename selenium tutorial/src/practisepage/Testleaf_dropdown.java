package practisepage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaf_dropdown 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.leafground.com/select.xhtml");
	 driver.manage().window().maximize();
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 WebElement tool = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
	 Select todrop = new Select(tool);
	 
	 todrop.selectByIndex(3);
	 Thread.sleep(3000);
	 todrop.selectByVisibleText("Selenium");
	 Thread.sleep(3000);
	 
	 List<WebElement> al = todrop.getOptions();
	 System.out.println(al.size());
	 Iterator<WebElement> itr = al.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next().getText());
	 }
	 
	 
//	 WebElement coun = driver.findElement(By.xpath("//*[@id=\"j_idt87:country_label\"]"));
//	 Select cdrop = new Select(coun);
//	 cdrop.selectByIndex(8);
//	 Thread.sleep(3000);
//	 cdrop.selectByVisibleText("India");
//	 Thread.sleep(3000);
//	 
//	 List<WebElement> al1 = cdrop.getOptions();
//	 System.out.println(al.size());
//	 Iterator<WebElement> itr1 = al1.iterator();
//	 while(itr1.hasNext())
//	 {
//		 System.out.println(itr1.next().getText());
//	 }
//	 
	 
	 
			 
	 
}
}
