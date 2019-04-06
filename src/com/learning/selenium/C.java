package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class C {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/selenium/deprecated.html";
		driver.get(baseURL);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		//driver.close();
	}
}
