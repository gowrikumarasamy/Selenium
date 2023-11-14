package practisepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcode_form 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/forms");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstname")).sendKeys("Ganesan");
		driver.findElement(By.id("lasttname")).sendKeys("sankaran");
		driver.findElement(By.id("email")).sendKeys("ganesansankaran@mail.com");
		driver.findElement(By.id("Phno")).sendKeys("3698520147");
		driver.findElement(By.id("Addl1")).sendKeys("no 5 kalaimagal street");
		driver.findElement(By.id("Addl2")).sendKeys("gurusamy nagar");
		driver.findElement(By.id("state")).sendKeys("tamilnadu");
		driver.findElement(By.id("postalcode")).sendKeys("6000070");
		WebElement con = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select"));////label[text()='Country']
		
		Select condrop = new Select(con);
		condrop.selectByIndex(5);
		Thread.sleep(3000);
		condrop.selectByVisibleText("India");
		
		Thread.sleep(3000);
		driver.findElement(By.id("Date")).click();
		
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' I agree to the ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[8]/div/input")).click();
		

	}

}
