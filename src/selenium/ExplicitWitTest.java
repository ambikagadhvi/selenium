package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //Max
		
		driver.findElement(By.name("B2")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept(); //click on Selected Button
		//al.dismiss(); //click on non-selected button
	}

}
