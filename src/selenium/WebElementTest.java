package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.facebook.com/"); // open Facebook
		
		
		
		WebElement Email;
		Email = driver.findElement(By.id("email"));// saving driver.findElement(By.id("email") in variable:Email
		Email.sendKeys("kfgsk,fghksdghfksahfglsahdh");
		
		
		
		

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("guagiulgudhgiodpo");

		WebElement LoginButton = driver.findElement(By.name("login"));
		LoginButton.click();
	}

}
