package practisepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class Demoqapractise 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	    WebElement fn = driver.findElement(By.xpath("//input[@id='firstName']"));
		fn.sendKeys("Ganesan");
		WebElement ln = driver.findElement(By.id("lastName"));
		ln.sendKeys("Sankaran");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("ganesansankaran@gmail.com");
		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));////*[text()='Male']
		
		wb.until(ExpectedConditions.elementToBeClickable(male));
		male.click();
		WebElement mn = driver.findElement(By.id("userNumber"));
		mn.sendKeys("9962300121");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3500)");
		
		driver.findElement(By.id("dateOfBirthInput")).click(); 
		
		WebElement year=driver.findElement(By.className("react-datepicker__year-select"));

		Select dropyear=new Select(year);

		dropyear.selectByVisibleText("1991");

		WebElement month=driver.findElement(By.className("react-datepicker__month-select"));

		Select dropmonth=new Select(month);

		dropmonth.selectByValue("5");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[6]")).click();
		Thread.sleep(3000);
		
//		WebElement sub = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]"));
//		sub.sendKeys("Maths");
	//	WebElement sub = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		//sub.sendKeys("resume");
		//System.out.println(sub.isEnabled());*/
		//WebElement sub = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]"));
		//sub.sendKeys("resume");

		/*WebElement sub = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		sub.sendKeys("maths");
		Thread.sleep(3000);*
		
		WebElement hob = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));////*[text()='Reading']
		hob.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\DELL\\Desktop\\screenschot1\\shot1.png");
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("dubakoor nagar,govinda street");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 7000)");
		/*WebElement drop = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
		Select dd = new Select(drop);
		dd.selectByValue("Tamil Nadu");*/
	
	//driver.findElement(By.xpath("//button[@id='submit']")).click();



	}

}
