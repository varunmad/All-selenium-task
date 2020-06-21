package com.web;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.thehut.com/");
	driver.manage().window().maximize();
	TakesScreenshot t= (TakesScreenshot) driver;
	File s=t.getScreenshotAs(OutputType.FILE);
	File d=new File("C:\\Users\\new\\eclipse-workspace\\WebTab\\ss.png");
	Files.copy(s,d);
	
}
}
