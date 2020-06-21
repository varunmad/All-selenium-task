package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class notify {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.notify();
	driver.findElement(By.id("q")).sendKeys("marina beach");
	
	
	
	
	}
	
}
