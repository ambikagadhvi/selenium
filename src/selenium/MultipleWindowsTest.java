package selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S420278167%3A1675543094545850&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfK1ww7pispvUloOi8z98yWs0NMtk3NFHbxhuSlqwmzFhfcRJ9pGEd3ts3rg6QZzzUdw3KwZw");
		
        
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);// Needs to pass windows handlehere
		System.out.println(driver.getTitle()); //Title for Help page
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle()); //Title for gmail page
		
	}

}
