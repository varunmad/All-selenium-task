package com.web;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListParticular {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.snapdeal.com/");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.id("inputValEnter"));
search.sendKeys("iphone 7",Keys.ENTER);
Thread.sleep(3000);
List<WebElement> l = driver.findElements(By.xpath("//p[@class='product-title']"));


for (WebElement x : l) {
	String text = x.getText();
	System.out.println(text);
	if(text.equals("Apple iPhone 7 Marble Bright Traders - Red")) {
x.click();
}

}
}
}