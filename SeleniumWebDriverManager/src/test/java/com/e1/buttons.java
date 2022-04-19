package com.e1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("hyr tutorials");
        driver.findElement(By.xpath(" /html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        
        
	}

}
