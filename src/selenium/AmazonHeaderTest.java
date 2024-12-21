package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.amazon.ca/");
		Thread.sleep(5000);
		
		List<WebElement> Amazon_header= driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(Amazon_header.size());
		
		Thread.sleep(5000);
		for(int i=0;i<Amazon_header.size();i++) {
			System.out.println(Amazon_header.get(i).getText());
		}
	}

}
