package com.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		/*
		 * System.out.println(driver.findElement(By.id("output")).getText());
		 * driver.findElement(By.id("alertBox")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 * System.out.println(driver.findElement(By.id("output")).getText());
		 */
//		WebElement myelement = driver.findElement(By.id("confirmBox"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", myelement);
		//System.out.println(driver.switchTo().alert().getText());
		
		/*
		 * System.out.println(driver.findElement(By.id("output")).getText());
		 * driver.findElement(By.id("confirmBox")).click();
		 */
			
		
//			  System.out.println(driver.findElement(By.id("output")).getText());
//			  
//			  WebElement myelement1 = driver.findElement(By.id("confirmBox"));
//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].click();", myelement1);
//				 driver.switchTo().alert().dismiss();
//				 System.out.println(driver.findElement(By.id("output")).getText());
				 
//				
				 WebElement myelement2= driver.findElement(By.id("promptBox"));
					JavascriptExecutor js2 = (JavascriptExecutor) driver;
					js2.executeScript("window.alert = function() {};");
					js2.executeScript("arguments[0].click();", myelement2);
					//js2.executeScript("window.alert = function() {};",myelement2);
					//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//					System.out.println(driver.findElement(By.id("output")).getText());
					
					/*
					 * driver.switchTo().alert().sendKeys("parmirtha");
					 * driver.switchTo().alert().accept();
					 * System.out.println(driver.findElement(By.id("output")).getText());
					 */
					   //driver.switchTo().alert().sendKeys("parmirtha");
					   //System.out.println(driver.findElement(By.id("output")).getText());
//					 WebElement myelement3= driver.findElement(By.id("promptBox"));
//						JavascriptExecutor js3 = (JavascriptExecutor) driver;
//						js2.executeScript("arguments[0].click();", myelement3);
//					 driver.switchTo().alert().dismiss();
//					 System.out.println(driver.findElement(By.id("output")).getText());
		
		  
					
			 
		  
		  driver.close();
	}

}
