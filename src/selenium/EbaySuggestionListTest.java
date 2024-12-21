package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
	    driver.get("https://www.ebay.ca/");
	    Thread.sleep(4000);
	// Text - iphone
	// Size - 12
	driver.findElement(By.id("gh-ac")).sendKeys("iphone");
	Thread.sleep(4000);

	List<WebElement> Ebay_iphone = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
	System.out.println(Ebay_iphone.size());

	for (int i = 0; i < Ebay_iphone.size(); i++) {
		System.out.println(Ebay_iphone.get(i).getText());
	}
}
}