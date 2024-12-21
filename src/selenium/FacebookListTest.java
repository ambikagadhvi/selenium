package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
		System.out.println(allLinks.size());
		//With // we can directly go to the particular place rather than /ul/li--- in this xpath

		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			
		}

	}

}
//Size and Text for facebook niche walefo