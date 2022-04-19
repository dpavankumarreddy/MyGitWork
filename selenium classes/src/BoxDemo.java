//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
//		Select dropdown1=new Select(driver.findElement(By.name("country")));
		//dropdown1.selectByValue("india");
		
	
	
		

}
}