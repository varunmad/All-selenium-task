package com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	driver.findElement(By.name("q")).sendKeys("marina beach \n");
	JavascriptExecutor js =(JavascriptExecutor)driver;
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	//js.executeScript("window.scroll(0,0)", "");
	//js.executeScript("window.scroll(0,450)","");
	//js.executeScript("window.scroll(0,0)","");
WebElement scrolldown = driver.findElement(By.xpath("//h3[contains(text(),'The many moods o')]"));
js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);

}
}