package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_add_remove 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
     driver.manage().window().maximize();
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());	
     driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
     Thread.sleep(3000);
}
}
