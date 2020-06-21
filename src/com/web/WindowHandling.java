package com.web;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class WindowHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.id("inputValEnter"));
search.sendKeys("iphone7",Keys.ENTER);
WebElement cart = driver.findElement(By.xpath("//p[contains(text(),'Apple iPhone 7 ( 32GB , 2 GB ) Rose Gold')]"));
cart.click();
String parID = driver.getWindowHandle();
Set<String> allID = driver.getWindowHandles();
for (String childId : allID) {
	if(!(parID.equals(allID))) {
		driver.switchTo().window(childId);
		}
}
WebElement add = driver.findElement(By.xpath("//span[contains(text(),'add to cart')]"));
add.click();
WebDriver de = driver.switchTo().window(parID);
}
}
