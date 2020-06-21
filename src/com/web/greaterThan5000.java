package com.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class greaterThan5000 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\new\\eclipse-workspace\\AaTestNgPrac\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
}
}
