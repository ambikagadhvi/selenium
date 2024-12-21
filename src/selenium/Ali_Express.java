package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ali_Express {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options); // open Firefox
		driver.get("https://best.aliexpress.com/?lan=en");
		
		
		
		WebElement popup_present = driver.findElement(By.className("_1-aaU"));
		//System.out.println(popup_present.size());
		
		
		
		if(popup_present != null) {
			driver.findElement(By.className("_24EHh")).click();
			driver.findElement(By.id("search-key")).sendKeys("Computer");
			System.out.println("We had 1 pop up");
		}else {
			driver.findElement(By.id("search-key")).sendKeys("Computer");
			System.out.println("No pop_up");
		}
	}

}
