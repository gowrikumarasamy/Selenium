package practisepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_webtable 
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/tables");
     driver.manage().window().maximize();
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
	List<WebElement> tab = driver.findElements(By.xpath("//*[@id=\"content\"]/div"));
	//*[@id="content"]/div	
	for(WebElement aa :tab)
	{
		System.out.println(aa.getText());
	}
	
}
}
