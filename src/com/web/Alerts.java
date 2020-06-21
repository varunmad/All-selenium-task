package com.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\new\\eclipse-workspace\\AaTestNgPrac\\chrome\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement con = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
	con.click();
WebElement al=	driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
al.click();
Alert a=driver.switchTo().alert();
String text = a.getText();
System.out.println(text);
a.sendKeys("sathish");
a.accept();

}
}
