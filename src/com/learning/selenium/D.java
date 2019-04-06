package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Downloads\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@value='Go!']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
