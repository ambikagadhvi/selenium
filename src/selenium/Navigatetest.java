package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().to() is same as driver.get() BUT other than that navigate.can be any of the below one
		//driver.navigate().back();
		//driver.navigate().refresh();
		
	}

}
