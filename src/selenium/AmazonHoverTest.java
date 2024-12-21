package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.amazon.ca/");
		Thread.sleep(2000);
		
		Actions am = new Actions(driver);
		WebElement Am_account= driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		am.moveToElement(Am_account).build().perform();
		
		List<WebElement>All_list = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(All_list.size());
		
		for(WebElement a :All_list) {
			System.out.println(a.getText());
		}
	
	}

}

