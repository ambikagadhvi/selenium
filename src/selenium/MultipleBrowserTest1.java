package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import selenium.Xls_Reader;



public class MultipleBrowserTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;     //driver needs to be declare globally
		String browser = "Chrome";
		
		Xls_Reader d = new Xls_Reader("C:\\Users\\ambik\\Downloads\\wetransfer_build-xml_2023-02-12_1938\\NikulTest.xlsx");
		 
		//FileInputStream inputStream = new FileInputStream(d);
		//HSSFWorkbook wb=new HSSFWorkbook(inputStream);*/
		
		browser = d.getCellData("Data1","Browser",2);
		System.out.println(browser);
		if (browser.equals("Firefox")){
			driver = new FirefoxDriver(); // (WebDriver driver = new FirefoxDriver)
		}else if(browser.equals("Chrome")) {
			driver = new ChromeDriver();//(WebDriver driver = new Chromedriver)--- so we declared above it as WebDriver driver
		}else {
			driver = new SafariDriver();
		
		}
           
		
		driver.get("https://www.facebook.com/"); // open Facebook
		driver.findElement(By.id("email")).sendKeys("kfgsk,fghksdghfksahfglsahdh");

		driver.findElement(By.name("pass")).sendKeys("guagiulgudhgiodpo");

		driver.findElement(By.name("login")).click();
	}


     
	}


