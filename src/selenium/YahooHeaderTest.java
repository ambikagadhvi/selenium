package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://ca.yahoo.com/");
		
		
		List<WebElement> Header_yahoo = driver.findElements(By.xpath("//ul[@class='_yb_nrifa _yb_1vv5t']//li"));
		System.out.println(Header_yahoo.size());
		
		for(int i=0;i<Header_yahoo.size();i++) {
			System.out.println(Header_yahoo.get(i).getText());
		}
		
	}

}
