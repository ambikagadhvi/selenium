package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		FileInputStream fn = new FileInputStream("C:\\QA\\Testing\\practise.properties");
		Properties p1 = new Properties();
		p1.load(fn);
		
		
		
		String browser =p1.getProperty("browser");
		System.out.println(browser);
		
		WebDriver driver;     //driver needs to be declare globally
		if (browser.equals("Firefox")){
			driver = new FirefoxDriver(); // (WebDriver driver = new FirefoxDriver)
		}else if(browser.equals("Chrome")) {
			driver = new ChromeDriver();//(WebDriver driver = new ChromeDriver)--- so we declared above it as WebDriver driver
		}else {
			driver = new SafariDriver();
		
		}
           
		
		driver.get("https://www.facebook.com/"); // open Facebook
		driver.findElement(By.id("email")).sendKeys("kfgsk,fghksdghfksahfglsahdh");

		driver.findElement(By.name("pass")).sendKeys("guagiulgudhgiodpo");

		driver.findElement(By.name("login")).click();
	}

}
