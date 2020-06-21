package com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {
	


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-table/");
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < tRows.size(); i++) {
		WebElement eRows = tRows.get(i);

	List<WebElement> tDatas = eRows.findElements(By.tagName("td"));
	for (int j = 0; j < tDatas.size(); j++) {
		WebElement eDatas = tDatas.get(j);
	String text = eDatas.getText();
System.out.println(text);
	}


	}




	}
	}


