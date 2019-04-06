package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL1 = "http://www.facebook.com";
		String baseURL2 = "http://www.youtube.com";
		driver.get(baseURL1 );
		driver.get(baseURL2);
		//WebElement webElement = driver.findElement(By.id("email"));
		//String tagName = webElement.getTagName();
		//System.out.println(tagName);
		//System.out.println(webElement.getText());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println("before");
		//driver.navigate().to("http://www.google.com");
		//System.out.println("After");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
		//driver.quit();
		
	}
}
