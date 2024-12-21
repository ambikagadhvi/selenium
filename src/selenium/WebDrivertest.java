package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrivertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Classname objname = new Classname();
		//FirefoxDriver driver = new Firefoxdriver();
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");

		// sendkey is the method used to give input
		driver.findElement(By.id("identifierId")).sendKeys("gfkajgfkjagfjkgfgjg");
		// driver.findElement(By.).click();
		driver.findElement(By.id("identifierNext")).click();

		// driver.findElement(By.id("pass")).sendKeys("ksgkashgkashdhslh");

		
	
	}

}
