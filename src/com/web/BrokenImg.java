package com.web;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImg {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\WebTab\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	int count=0;
	for(WebElement linkname:links) {
	
			String att = linkname.getAttribute("href");
			System.out.println(att);
			if(!(linkname==null)) {
				URL u=new URL(att);
				URLConnection o =u.openConnection();
				HttpsURLConnection h=(HttpsURLConnection)o;
				int responseCode = h.getResponseCode();
					if(!(responseCode==200)) {
					count ++;
					System.out.println(linkname);
				}
				}
				}
				}
}
