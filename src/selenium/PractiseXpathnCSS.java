package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseXpathnCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
 
 driver.get("http://mykong.com/");
 
 driver.findElement(By.cssSelector("p_.si34.")).click();
	}

}
