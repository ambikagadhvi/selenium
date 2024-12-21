package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayheaderTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("\"https://www.ebay.ca/\"");
		
		
		List<WebElement> Ebay_Header= driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(Ebay_Header.size());
		
		for (int i=0;i<Ebay_Header.size();i++) {
			System.out.println(Ebay_Header.get(i).getText());
		}
		
	}

}
