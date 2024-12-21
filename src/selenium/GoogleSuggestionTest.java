package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.name("q")).sendKeys("canada");
		
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));
		
		
		List<WebElement> DropDown = driver.findElements(By.xpath("//ul[@role= 'listbox']/li"));
		System.out.println(DropDown.size());
		
		for (int i=0; i< DropDown.size(); i++) {
			System.out.println(DropDown.get(i).getText());
		}
	}

}
