package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLibrariesSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		 WebElement frstName=driver.findElement(By.id("firstName"));
		 frstName.sendKeys("parmitha");
		 Thread.sleep(2000);
		 	frstName.clear();	
		 driver.findElement(By.id("femalerb")).click();
		 Thread.sleep(2000);
	 driver.findElement(By.id("englishchbx")).click();
	 Thread.sleep(2000);
	WebElement hindiChk= driver.findElement(By.id("hindichbx"));
	
	hindiChk.click();
	
	Thread.sleep(2000);
	if(hindiChk.isDisplayed())
		hindiChk.click();
	Thread.sleep(2000);
	driver.findElement(By.id("registerbtn")).click();
	System.out.println(driver.findElement(By.id("msg")).getText());
	Thread.sleep(2000);
	driver.findElement(By.linkText("Click here to navigate to the home page")).click();
driver.quit();
	}

}
