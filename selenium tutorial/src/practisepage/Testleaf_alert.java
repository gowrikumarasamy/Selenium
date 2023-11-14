package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf_alert
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement alert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alert.click();
		Alert alt = driver.switchTo().alert();
		System.out.println("the alert message is: " + alt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		WebElement conalt = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		conalt.click();
		//System.out.println("the alert message is: " + conalt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[2]"));
		alert1.click();
		System.out.println("the alert message is: " + alert1.getText());
		Thread.sleep(3000);
		alt.accept();
	}

}
