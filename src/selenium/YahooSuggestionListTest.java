package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://ca.yahoo.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("canada");
		Thread.sleep(4000);
		
		List<WebElement> DropDown = driver.findElements(By.xpath("//ul[@class='_yb_18a0q']//li"));
		System.out.println(DropDown.size());
		
		for (int i=0; i< DropDown.size(); i++) {
			System.out.println(DropDown.get(i).getText());
		}
	//Size - 10
	// Text - Canada
}
}