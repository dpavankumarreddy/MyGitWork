package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aletspage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
//		  System.out.println(driver.findElement(By.id("output")).getText());
//		  driver.findElement(By.id("alertBox")).click();
//		  System.out.println(driver.switchTo().alert().getText());
//		  driver.switchTo().alert().accept();
//		  System.out.println(driver.findElement(By.id("output")).getText());
		  
		  
		 

		// confirm box
		  System.out.println(driver.findElement(By.id("output")).getText());
		  driver.findElement(By.id("confirmBox")).click();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  System.out.println(driver.findElement(By.id("output")).getText());
		  System.out.println(driver.findElement(By.id("output")).getText());
		  driver.findElement(By.id("confirmBox")).click();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().dismiss();
		  System.out.println(driver.findElement(By.id("output")).getText());
		  

		// System.out.println(driver.findElement(By.id("output")).getText());

		driver.close();

	}

}
