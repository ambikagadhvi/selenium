package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("canada");
		Thread.sleep(4000);
		
		List<WebElement> DropDown = driver.findElements(By.xpath("//ul[@role= 'listbox']/li"));
		System.out.println(DropDown.size());
		
		for (int i=0; i< DropDown.size(); i++) {
			System.out.println(DropDown.get(i).getText());
		}
	}

}
	


