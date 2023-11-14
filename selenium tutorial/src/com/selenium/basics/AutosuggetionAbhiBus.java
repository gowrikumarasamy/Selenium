
package com.selenium.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutosuggetionAbhiBus {

	static int i,j;
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[1]/div/div/div/div/div[2]/input")).sendKeys("che");
//		
//		List<WebElement> places = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div/div[1]/ul/li"));///html/body/ul[1]/li[1]
//		///html/body/ul[1]/li[2]
//		
//		System.out.println(places.size());
//
//		// for printing the places name
//		for (WebElement aa : places) {
//			System.out.println(aa.getText());
//		}
//		// for clicking the particular place
//		for (WebElement bb : places) {
//			if (bb.getText().equalsIgnoreCase("chennai")) {
//				bb.click();
//				break;
//			}
//		}

		System.out.println("========================");

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/input")).sendKeys("Coim");
		
		List<WebElement> toplaces = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[3]/div/div[2]/ul/li"));
		// printing
		for (int i=0; i<toplaces.size(); i++) {
			System.out.println(toplaces.get(i).getText());
		}
		// clicking
		for (WebElement bb : toplaces) {
			if (bb.getText().startsWith("Coimb")) {
				bb.click();
				break;
			}
		}
		System.out.println("==========================");

		driver.findElement(By.xpath("/html/body/header/section/div/div/div/div/div/div[1]/form/div/div[4]/a/div/div/div[2]/div/input")).click();
		////html/body/header/section/div/div/div/div/div/div[1]/form/div/div[4]/a/div/div/div[2]/div/input

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/a/span")).click();
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/span[1]")).getText());

		List<WebElement> dateTable1 = driver.findElements(By.xpath("/html/body/div[5]/div[1]/table"));

		for (WebElement aa : dateTable1) {
			System.out.println(aa.getText());
		}

		System.out.println("===============================");
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/span[1]")).getText());

		List<WebElement> dateTable2 = driver.findElements(By.xpath("/html/body/div[5]/div[2]/table"));

		for (WebElement aa : dateTable2) {
			System.out.println(aa.getText());
		}
		
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/table/tbody/tr[1]/td[5]/a")).click();
	}


}
