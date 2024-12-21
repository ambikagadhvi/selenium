package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      FirefoxDriver driver = new FirefoxDriver();
      driver.get("https://www.google.com/");
      
      driver.findElement(By.linkText("About")).click();
      //driver.findElement(By.partialLinkText("Abo")).click();
      
      
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
      
      wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
      String ExpectedTitle = "Google - About Google, Our Culture & Company News";
      String ActualTitle = driver.getTitle();
      System.out.println(ActualTitle);
      
     wait.until(ExpectedConditions.urlToBe("https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header"));
      
     String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl(); //read the current url from the browser
		System.out.println(actualUrl);
		
		if(ExpectedTitle.equals(ActualTitle) & expectedUrl.equals(actualUrl)) {
			
    	  System.out.println("Hey, I am at right place");
      }else {
    	  System.out.println("Failed");
      }
      
      
	}

}
