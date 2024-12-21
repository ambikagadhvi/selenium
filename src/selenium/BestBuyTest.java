package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BestBuyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.bestbuy.ca");
		
		
	
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		
		List<WebElement> Shop_links = driver.findElements(By.xpath("(//div[@data-automation= 'menu-main-l1'])[1]/a"));
		
		System.out.println(Shop_links.size());
		
		
		for(WebElement a: Shop_links) {
			System.out.println(a.getText());
		}
	}

}
