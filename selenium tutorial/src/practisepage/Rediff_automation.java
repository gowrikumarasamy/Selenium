package practisepage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_automation 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
		//driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	  driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create Account")).click();
		WebElement fn = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fn.sendKeys("vanithadevi");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		email.sendKeys("vanithadevi2507");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='newpasswd']"));
		pwd.sendKeys("instap@2507");
		WebElement pwd1 = driver.findElement(By.xpath("//input[@id='newpasswd1']"));
		pwd1.sendKeys("instap@2507");
		WebElement amail = driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
		amail.sendKeys("vanithadevi2707@gmail.com");
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='mobno']"));
		mobileno.sendKeys("7708853352");
		
		WebElement dob = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
//		WebElement dob = driver.findElement(By.xpath("//*[text()='Date of Birth']"));
		Select daydrop = new Select(dob);
		daydrop.selectByIndex(5);
		Thread.sleep(2000);
		daydrop.selectByVisibleText("25");
		Thread.sleep(2000);
		
		
		List<WebElement> al = daydrop.getOptions();
		 System.out.println(al.size());
		 Iterator<WebElement> itr = al.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next().getText());
		 }
		
		 WebElement month = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
		Select monthdrop = new Select(month);
		monthdrop.selectByVisibleText("JUL");
		Thread.sleep(2000);
		
		List<WebElement> al1 = monthdrop.getOptions();
		 System.out.println(al1.size());
		 Iterator<WebElement> itr1 = al1.iterator();
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next().getText());
		 }
		
		WebElement year = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		Select yeardrop = new Select(year);
//		yeardrop.selectByIndex(10);
//		Thread.sleep(2000);
//		
//		yeardrop.selectByValue("5");
//		Thread.sleep(2000);
//		
		yeardrop.selectByVisibleText("1995");
		Thread.sleep(2000);
		
		
		List<WebElement> al2 = yeardrop.getOptions();
		 System.out.println(al2.size());
		 /*Iterator<WebElement> itr2 = al2.iterator();
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next().getText());
		 }*/
		 for(WebElement s : al2)
		 {
			 System.out.println(s.getText());
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
		 
		WebElement con = driver.findElement(By.xpath("//select[@id='country']"));
         Select condrop = new Select(con);
         
         condrop.selectByIndex(10);
         Thread.sleep(2000);
         
         condrop.selectByVisibleText("India");
         Thread.sleep(2000);
         
         List<WebElement> al3 = condrop.getOptions();
         System.out.println(al3.size());
         Iterator<WebElement> itr3 = al3.iterator();
         while(itr3.hasNext())
         {
        	 System.out.println(itr3.next().getText());
         }
         Thread.sleep(2000);
         
         WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
         Select citydrop = new Select(city);
         
         citydrop.selectByIndex(20);
         Thread.sleep(2000);
         
         citydrop.selectByVisibleText("Chennai");
         Thread.sleep(2000);
         
         List<WebElement> al4 = citydrop.getOptions();
         System.out.println(al4.size());
         Iterator<WebElement> itr4 = al4.iterator();
         while(itr4.hasNext())
         {
        	 System.out.println(itr4.next().getText());
         }
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//input[@id='Register']")).click();
         
         
		

	}

}
