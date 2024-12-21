package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaExecutorClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
        driver.get("https://www.adidas.ca/en");
         driver.findElement(By.xpath("//span[contains(text(),'Careers')]")).click();
	}

}

	



	