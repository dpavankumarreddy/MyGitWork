import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProjecct1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]")).click();
		//driver.close();
		//driver.quit();    
		//driver.navigate().to("http://fb.com");
		//Thread.sleep(10000);
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.navigate().forward();
		//driver.navigate().refresh
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("9133820500");
		//Thread.sleep(5000);

		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		//System.out.println(driver.findElement(By.id("heading")).getText());
		//System.out.println(driver.findElement(By.id("selenium")).isDisplayed());
	   // System.out.println(driver.findElement(By.id("b2")).isEnabled());
//	    System.out.println(driver.findElement(By.id("male")).isSelected());
	    
	}

}
