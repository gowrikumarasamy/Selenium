 package com.selenium.basics;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args)throws IOException
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		d.manage().window().maximize();
		//File sr=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File sr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//File sr1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//File sr = ((TakeScreenshot)d).getScreenshotAs(OutputType.FILE)
		FileHandler.copy(sr,new File("C:\\Users\\DELL\\Desktop\\screenschot1\\shot6.png"));
		//File sr1 = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());

	}

}
