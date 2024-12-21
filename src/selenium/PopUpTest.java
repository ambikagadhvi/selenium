package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(5000);

		List<WebElement> popup1 = driver.findElements(By.className("_24EHh"));
		System.out.println(popup1.size());

		if (popup1.size() > 0) {
			popup1.get(0).click();
		}
		List<WebElement> popup2 = driver.findElements(By.className("close-btn"));
		System.out.println(popup2.size());

		if (popup2.size() > 0) {
			popup2.get(0).click();
		}
       driver.close();
		driver.findElement(By.id("search-key")).sendKeys("Computer");

	}

}
