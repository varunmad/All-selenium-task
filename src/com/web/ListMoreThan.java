package com.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListMoreThan {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.manage().window().maximize();
WebElement search = driver.findElement(By.id("inputValEnter"));
search.sendKeys("iphone7",Keys.ENTER);

driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

List<WebElement> l = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
System.out.println(l.size());
Set<WebElement>s=new TreeSet<WebElement>();
s.addAll(l);
System.out.println(s.size());

for (WebElement x : s) {
	String attribute = x.getAttribute("display-price");
int p = Integer.parseInt(attribute);
if(p>=10000) {
	x.click();
	System.out.println(attribute);
}
}
}
}
