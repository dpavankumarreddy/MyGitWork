import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
           // WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("http://google.com");
            driver.findElement(By.name("q")).sendKeys("facebook signup");
            driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).submit();
	         driver.navigate().to("http://youtube.com");
	         driver.navigate().back();
	        
	}
}