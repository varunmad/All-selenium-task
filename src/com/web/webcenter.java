package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webcenter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	int s=tRows.size()/2;
		WebElement eRows = tRows.get(s);

	List<WebElement> tDatas = eRows.findElements(By.tagName("td"));
	int si=tDatas.size()/2;
	WebElement eDatas = tDatas.get(si);
	String text = eDatas.getText();
System.out.println(text);
	}


	}




	
