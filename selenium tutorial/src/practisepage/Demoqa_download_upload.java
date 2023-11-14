package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_download_upload 
{
  public static void main(String[] args) throws InterruptedException
  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\DELL\\Downloads\\sampleFile (1).jpeg");
		
		

	}

}
