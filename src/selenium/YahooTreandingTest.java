package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTreandingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> Trending_Now = driver.findElements(By.xpath("//div[@class='bd wafer-tabs-target']/div[1]//a"));
		System.out.println(Trending_Now.size());
		
		for (int i = 0; i < Trending_Now.size(); i++) {
			System.out.println(Trending_Now.get(i).getText());
		}

	}

}
//