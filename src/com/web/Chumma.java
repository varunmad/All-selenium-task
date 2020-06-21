package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chumma {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.livecareer.com/resume-search/r/mobile-application-tester-ba7e13bf84a64687850b3d5e2f14dc94");
	driver.get("");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("PARAGRAPH_843718165_1_550346812"));
	String t = search.getText();
	System.out.println(t);
}
}