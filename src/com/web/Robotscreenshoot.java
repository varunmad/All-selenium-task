package com.web;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotscreenshoot {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\new\\\\eclipse-workspace\\\\AaTestNgPrac\\\\chrome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.thehut.com/");
		driver.manage().window().maximize();
		Robot r=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Rectangle rec=new Rectangle(screenSize);
BufferedImage source = r.createScreenCapture(rec);
File loc=new File("C:\\Users\\new\\eclipse-workspace\\WebTab\\ss.png");
	ImageIO.write(source, "png", loc);
	
	}
}