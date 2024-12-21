package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	 
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.google.com/"); 
		
		
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));		
		System.out.println(AllLinks.size());
		
	for(int i=0;i<AllLinks.size();i++) {
		System.out.println(AllLinks.get(i).getText());
	}
		
	}

}
