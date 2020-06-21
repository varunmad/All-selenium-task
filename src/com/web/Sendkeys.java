package com.web;

import java.awt.AWTException;
import java.awt.KeyEventPostProcessor;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);

	//driver.findElement(By.name("q")).sendKeys("selenium \n");
//	WebElement t = driver.findElement(By.name("q"));
//	t.sendKeys("selenium");
//	t.submit();
		WebElement t = driver.findElement(By.name("q"));
		t.sendKeys("selenium");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
}