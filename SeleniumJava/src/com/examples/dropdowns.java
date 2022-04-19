package com.examples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		WebElement cousreelement=driver.findElement(By.id("course"));
		Select   coursenamedropdown=new Select(cousreelement);
		List<WebElement>  coursenamedropdownoption=coursenamedropdown.getOptions();
		for (WebElement options : coursenamedropdownoption) {
			System.out.println(options.getText());
			
			
		}
		coursenamedropdown.selectByIndex(1);
		Thread.sleep(2000);
		coursenamedropdown.selectByValue("net");
		Thread.sleep(2000);
		coursenamedropdown.selectByVisibleText("Javascript");
		
		Thread.sleep(2000);
		String selectedtxt=coursenamedropdown.getFirstSelectedOption().getText();
		
		System.out.println("selected text visible-" +selectedtxt);
		
		}
			
		
		
		
	

	}


