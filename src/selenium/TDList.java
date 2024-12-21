package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.td.com/ca/en/personal-banking");
		
		List<WebElement> Td_footer = driver.findElements(By.xpath("//ul[@class='cmp-footer__links']/li"));
		System.out.println(Td_footer.size());
		
		for(int i=0; i<Td_footer.size();i++) {
			System.out.println(Td_footer.get(i).getText());
		}
		

	}

}
