package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);//This is for firefoxDriver.Chromedriver or any class driver
		
		//File scrFile = ((TakenScreenshot)driver).getScreenshotAs(OutputType.FILE); // For Webdriver
		
		FileUtils.copyFile(screenShotFile, new File("C:\\QA\\Testing\\screenshot.png"));
	}

}
