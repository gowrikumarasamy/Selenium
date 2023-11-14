package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_download 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/download");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//a[text()='Homework2.png']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='sample-zip-file.zip']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Diploma.pdf']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='5mb script.xml']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='The-Future-100-2022.pdf']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='cypress.txt']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='sample_media_file.png']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='package.json']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='CF-01255-278A(2023-05)SE.pdf']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='vfd (6).xlsx']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='555665FD-1299-4762-9AC0-2DA974B964FA.png']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='megadyneBladeHero.jpg']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='some-file.txt']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='a_change.csv']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='empty.txt']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Jpeg_with_exif.jpeg']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='LambdaTest.txt']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='D.png']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='sample.png']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='sample.png']")).click();
	  Thread.sleep(2000);
	  
	  }

}
