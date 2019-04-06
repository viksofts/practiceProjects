package com.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/newtours/";
		driver.get(baseURL);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title matched");
		} else {
			System.out.println("title not equal");
		}

		driver.close();
	}
}
