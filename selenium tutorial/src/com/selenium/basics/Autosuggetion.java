 
package com.selenium.basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Autosuggetion {

	static int i,j;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#src")).sendKeys("ch");
		List<WebElement> places = driver.findElements(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[1]/div/div[1]/ul/li"));
		System.out.println(places.size());

		// for printing the places name
		for (WebElement aa : places) {
			System.out.println(aa.getText());
		}
		// for clicking the particular place
		for (WebElement bb : places) {
			if (bb.getText().equalsIgnoreCase("chennai")) {
				bb.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("input#dest")).sendKeys("Coim");
		List<WebElement> toplaces = driver.findElements(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[3]/div[1]/ul/li"));
		// printing
		for (int i=1; i<toplaces.size(); i++) {
			System.out.println(toplaces.get(i).getText());
		}
		// clicking
		for (WebElement bb : toplaces) {
			if (bb.getText().startsWith("Coimb")) {
				bb.click();
				break;
			}
		}


	}

}
