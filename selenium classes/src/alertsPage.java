import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsPage {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("file:///C:/selenium%20drivers/mounika.html"); 
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 */
      driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
       //simplealert
     driver.findElement(By.id("alertBox")).click(); 
     
       Alert simplealert= driver.switchTo().alert();
      System.out.println(simplealert.getText());
      Thread.sleep(2000);
       simplealert.accept();
      Thread.sleep(1000);
     driver.quit();
    // confirmation box
//      driver.findElement(By.id("confirmBox")).click(); 
//      
//      Alert confirmbox= driver.switchTo().alert();
//      System.out.println(confirmbox.getText());
//     confirmbox.accept();
	}

}
