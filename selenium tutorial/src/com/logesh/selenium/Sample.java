package com.logesh.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement createbtn=driver.findElement(By.partialLinkText("Creat"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", createbtn);
		
		WebElement firstnamefield=driver.findElement(By.name("firstname"));
		
		js.executeScript("arguments[0].value='admin';", firstnamefield);
		
		WebElement terms=driver.findElement(By.id("terms-link"));
		
		js.executeScript("arguments[0].click();", terms);
		
		Set<String> windows=driver.getWindowHandles();
		
		ArrayList<String> list=new ArrayList<String>(windows);
		
		driver.switchTo().window(list.get(1));
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.switchTo().window(list.get(0));		
	}

}
