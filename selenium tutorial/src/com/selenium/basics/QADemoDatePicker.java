
package com.selenium.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class QADemoDatePicker {

	static WebDriver driver;
	static WebElement monthDropDown;
	static Select dropmonth;
	static WebElement yearDropDown;
	static Select dropyear;
	static List<WebElement> tableRows;
	static List<WebElement> tableColumns;

	public static void date(String year,String month,String date)
	{

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/date-picker");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/input")).click();///html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/input

		monthDropDown = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));

		dropmonth=new Select(monthDropDown);

		dropmonth.selectByVisibleText(month);

		yearDropDown = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));

		dropyear=new Select(yearDropDown);

		dropyear.selectByVisibleText(year);

		tableRows = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div"));

		for(int i=1; i<=tableRows.size(); i++){

			tableColumns = driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div["+i+"]/div"));

			for (WebElement aa : tableColumns){

				System.out.println(aa.getText());
			}

			for (WebElement aa : tableColumns){
				if(aa.getText().equals(date))
				{
				aa.click();
				break;
				}
			}
		}


	}

	public static void main(String[] args) throws InterruptedException 
	{

		date("1989", "June","13");

	}


}
