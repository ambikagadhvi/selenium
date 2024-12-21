package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptexecutorclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("http://www.adidas.ca/en/");

		WebElement careers = driver.findElement(By.linkText("Careers"));
		// careers.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Option 1: Scroll By x and Y coordinate
		System.out.println(careers.getLocation());
		jse.executeScript("window.scrollBy(0,5000)");

		// option 2 - Scroll until the element is in the view
		jse.executeScript("arguments[0].scrollIntoView(true);", careers);

		// option 3- Direct click
				jse.executeScript("arguments[0].click();",careers);
	}

}
