package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.facebook.com/"); // open Facebook
      driver.findElement(By.id("email")).sendKeys("kfgsk,fghksdghfksahfglsahdh");
      
      driver.findElement(By.name("pass")).sendKeys("guagiulgudhgiodpo");
      
      driver.findElement(By.name("login")).click();
	}

}
