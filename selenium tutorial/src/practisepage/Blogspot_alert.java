package practisepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Blogspot_alert 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://only-testing-blog.blogspot.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//input[@id='gparent_1']")).sendKeys("venkataraman");
	  driver.findElement(By.xpath("//*[@id=\"parent_1\"]")).sendKeys("kumarasamy");
	  driver.findElement(By.xpath("//input[@id='child_1']")).sendKeys("Devi");
	  
	  driver.findElement(By.xpath("//input[@id='gparent_2']")).sendKeys("Kamala");
	  driver.findElement(By.xpath("//*[@id=\"parent_2\"]")).sendKeys("Annapurani");
	  driver.findElement(By.xpath("//*[@id=\"child_2\"]")).sendKeys("Gowri");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0, 2500)");
	  Actions a = new Actions(driver);
	  
	  WebElement dc = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	  a.doubleClick(dc).perform();
	  Thread.sleep(2000);
	  
	  Alert alt = driver.switchTo().alert();
	  System.out.println("the alert message is: " + alt.getText());
	  Thread.sleep(3000);
	  alt.accept();
	  
       js.executeScript("window.scrollBy(0, 1200)");
     WebElement fn = driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/div/input[1]"));
     fn.sendKeys("gowri");
     driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/div/input[2]")).sendKeys("kumarasamy");
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/table/tbody/tr[1]/td[1]/input")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/table/tbody/tr[2]/td[1]/input")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/table/tbody/tr[3]/td[1]/input")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/table/tbody/tr[4]/td[1]/input")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-536524247070242612\"]/div[1]/table/tbody/tr[5]/td[1]/input")).click();
     Thread.sleep(2000);
     
     js.executeScript("window.scrollBy(0, 500)");
     driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[1]")).sendKeys("gowri");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[2]")).sendKeys("kumarasamy");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[3]")).sendKeys("gowri@mail.com");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[4]")).sendKeys("9876543210");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[5]")).sendKeys("infomats");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[6]")).click();
     Thread.sleep(2000);
     
    alt.accept();
    Thread.sleep(1000);
   
    
   /* js.executeScript("window.scrollBy(0, 300)");
    driver.findElement(By.xpath("//a[text()='Download Text File']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Download PDF File']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Download CSV File']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Download Excel File']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Download Doc File']")).click();
    Thread.sleep(2000);
    
    
    
     /*WebElement fn = driver.findElement(By.xpath("//*[@id=\"post-body-6455223446070396919\"]/div[1]/form/input[1]"));
	  fn.sendKeys("gowri");
	  WebElement ln = driver.findElement(By.xpath("//*[@id=\"post-body-6455223446070396919\"]/div[1]/form/input[2]"));
	  ln.sendKeys("kumarasamy");
	 
	  driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
	  Alert alt = driver.switchTo().alert();
	  System.out.println("the alert message is: " + alt.getText());
	  Thread.sleep(3000);
	  alt.accept();*/
	}
}
