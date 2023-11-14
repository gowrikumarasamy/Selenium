package practisepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode_table 
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new ChromeDriver();
	   driver.get("https://letcode.in/table");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	 List<WebElement> table = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]"));
	  System.out.println(table.size());
	  for(WebElement aa : table)
	  {
		  System.out.println(aa.getText());
	  }
	  /*List<WebElement> table = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div"));
	  System.out.println(table.size());
	  for(WebElement bb : table)
	  {
		  System.out.println(bb.getText());
	  }*/
	  
}
}
