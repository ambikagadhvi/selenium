package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		String s = driver.findElement(By.name("_nkw")).getAttribute("placeholder");
		System.out.println(s);
		driver.findElement(By.name("_nkw")).sendKeys("iphone");
		
		//INTERVIEW QUESTION:
		
	//TO READ WHAT YOU HAVE TYPED IN AN INPUT BOX ALWAYS .getATTRIBUTE("value");
		String x = driver.findElement(By.name("_nkw")).getAttribute("value");
		System.out.println(x);
	}

}
