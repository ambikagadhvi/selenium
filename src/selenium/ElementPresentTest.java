package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		
   //Using WebElement we cannot verify if element present or not . Element must be present
		
		
		/*if (driver.findElement(By.linkText("ghajgshg")).isDisplayed()){
			System.out.println("Element present");
			
		}else {
			System.out.println("Not present");
		}*/
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("PRESENT");
		}else {
			System.out.println("NOT PRESENT");
		}
			
	}
}
