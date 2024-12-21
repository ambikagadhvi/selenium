package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorclassTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.facebook.com/"); // open Facebook
      
		
		
		driver.findElement(By.cssSelector("*[placeholder='Email or phone number'][name='email']")).sendKeys("kfgsk,fghksdghfksahfglsahdh");
      
      driver.findElement(By.cssSelector("input[aria-label*='Pass']")).sendKeys("guagiulgudhgiodpo");
      
      driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();	
		
}
}




