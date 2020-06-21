package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement name = driver.findElement(By.id("email"));
	JavascriptExecutor j =(JavascriptExecutor) driver;
	j.executeScript("arguments[0].setAttribute('value','sathish')", name);
	String s=(String)j.executeScript("return arguments[0].getAttribute('value')", name);
	
}
}
