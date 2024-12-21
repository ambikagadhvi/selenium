package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S420278167%3A1675543094545850&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfK1ww7pispvUloOi8z98yWs0NMtk3NFHbxhuSlqwmzFhfcRJ9pGEd3ts3rg6QZzzUdw3KwZw");
		
        
		driver.findElement(By.id("identifierId")).sendKeys("jhfgskvg4545$%$%");
		
	
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		String Expected_error = "Couldn’t find your Google Account";
		
		String Actual_error = driver.findElement(By.className("o6cuMc")).getText();
		
		System.out.println(Actual_error );
		
		if (Expected_error.equals(Actual_error)) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
	}

}
