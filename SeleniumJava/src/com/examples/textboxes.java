package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	     Thread.sleep(1000);
	    WebElement  txtfield= driver.findElement(By.id("login_field"));
	    
	    Thread.sleep(2000);
	    
	  if (txtfield.isDisplayed()){
		  if(txtfield.isEnabled()) {
			  txtfield.sendKeys("parmitha");
		  
			  String  enteredtxt=txtfield.getAttribute("value");
			  System.out.println(enteredtxt);
			  Thread.sleep(2000);
			  txtfield.clear();
			  
		  }
		  else
			  System.err.println("username textbox is not displayed");
	  }
	  {
		  System.err.println("username textbox is not displayed");
		  
	  }
	    
	   driver.quit(); 

	}

}
