package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
WebElement mouse = driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
Actions a=new Actions(driver);
	a.moveToElement(mouse).perform();
	WebElement right = driver.findElement(By.xpath("//span[text()='Smartphones']"));	
	a.contextClick().perform();
	
	
	
	}
}