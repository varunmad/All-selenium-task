package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	List<WebElement> frame = driver.findElements(By.xpath("//iframe"));
	driver.switchTo().frame("f1");
	driver.switchTo().frame("f2");
	
}
}
