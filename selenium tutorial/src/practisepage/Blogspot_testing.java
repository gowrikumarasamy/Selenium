package practisepage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blogspot_testing 
{
  public static void main(String[] args) throws InterruptedException 
  {
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='text1']")).sendKeys("gowri");
		//driver.findElement(By.xpath("//input[@id='text2']")).sendKeys("kumarasamy");
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='check3']")).click();
		driver.findElement(By.xpath("//input[@id='radio2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/form[1]/input[10]")).sendKeys("C:\\Users\\DELL\\Downloads\\WebTableHandling (1).java");
		Thread.sleep(2000);
		
		WebElement list = driver.findElement(By.xpath("//select[@id='Carlist']"));
		Select listdrop = new Select(list);
//		listdrop.selectByIndex(2);
//		Thread.sleep(2000);
		
//		listdrop.selectByValue("2");
//		Thread.sleep(2000);
		
		listdrop.selectByVisibleText("BMW");
	Thread.sleep(2000);
		
		List<WebElement> ld = listdrop.getOptions();
		for(WebElement r : ld)
		{
			System.out.println(r.getText());
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 200)");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();////button[text()='Show Me Confirmation']
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println("the alert message is: " + alt.getText());
		alt.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@onclick='myFunction1()']")).click();////input[@value='Show Me Alert']
		System.out.println("the alert message is: " +alt.getText());
		Thread.sleep(3000);
		alt.accept();
		
		//driver.findElement(By.xpath("//button[text()='Show Me Prompt']")).click();////button[@onclick='myFunctionf()']
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 150)");
		
		List<WebElement> tab = driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table"));
		for(WebElement a : tab)
		{
			System.out.println(a.getText());
		}
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		

	}

}
