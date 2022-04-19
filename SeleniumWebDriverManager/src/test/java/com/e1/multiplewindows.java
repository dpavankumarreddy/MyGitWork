package com.e1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindows {

	public static void main(String[] args) {
		
		     System.setProperty("webdriver.chromedriver.exe","C:selenium drivers");
             WebDriverManager.chromedriver().setup();
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.google.com");
            driver.findElement(By.id("newWindowBtn")).click();
             
             
	}

}
