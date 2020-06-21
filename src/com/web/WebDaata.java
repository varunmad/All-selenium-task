package com.web;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDaata {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
Set<Cookie> cookies = driver.manage().getCookies();
for (Cookie cookie : cookies) {
	System.out.println(cookie);
}
WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Greens technology’s selenium training')]"));
String text = para.getText();
System.out.println(text);


}

}




