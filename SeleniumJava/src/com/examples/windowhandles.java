package com.examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("parentwindowhandle -" + parentwindowhandle + driver.getTitle());
		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		for (String windowhandle : windowhandles) {
			driver.switchTo().window(windowhandle);
			System.out.println(windowhandle + driver.getTitle());

		}
		driver.quit();
	}

}
