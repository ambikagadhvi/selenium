package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackandForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());//About Title page
		
	
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
		
		System.out.println(driver.getTitle());//Google Title page
		
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());//About Title page
		
		
	}

}
