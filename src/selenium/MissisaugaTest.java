package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MissisaugaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
        driver.get("https://www.mississauga.ca");
        
      driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
        
        List<WebElement> all_links = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']//a"));
       System.out.println(all_links.size());
        
       for(WebElement a : all_links) {
			System.out.println(a.getText());
		}
	
	}

}

    //ul[@class='main-nav-links']/li[3]//li