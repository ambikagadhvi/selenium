package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.nike.com/ca/");
		
		Actions nike = new Actions(driver);
		WebElement Men = driver.findElement(By.linkText("Men"));
		nike.moveToElement(Men).build().perform();
		
		List<WebElement> All_links = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes,')]"));
		System.out.println(All_links.size());
		  Thread.sleep(2000);
		  
	        for(WebElement a : All_links) {
				System.out.println(a.getText());
			}
		
	}

}