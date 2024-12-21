package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.google.com/"); 
		
		WebElement footer = driver.findElement(By.cssSelector("div[jscontroller='NzU6V'] a"));
		
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		System.out.println(allLinks);
		
		//List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		
//		System.out.println(allLinks.size());
//		
//		for(int i=0; i<allLinks.size();i++) {
//			System.out.println(allLinks.get(i).getText());
//		}
		
		WebElement prod = allLinks.stream().filter(link->
		link.findElement(By.xpath("//a[contains(text(),'How Search works')]")).getText().equals("How Search works")).findFirst().orElse(null);
				
		
	 	System.out.println(prod);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
