

package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.facebook.com/");
	     
	     driver.findElement(By.linkText("Create new account")).click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     // This is max time, Implicit wait is generic, it works wait to "find Element" anf if element is found it does not wait.
	     
	     
	     //Thread.sleep(4000);----This is fix time
	     
	     driver.findElement(By.name("lastname")).sendKeys("Gadhvi");
	     driver.findElement(By.name("reg_email__")).sendKeys("6476222345");
	     driver.findElement(By.id("password_step_input")).sendKeys("Aashy%234");
	     
	  
	     WebElement dropdown= driver.findElement(By.id("month"));
	     Select s= new Select(dropdown);
	     s.selectByVisibleText("Jul");
	     
	     dropdown= driver.findElement(By.id("day"));
	     s= new Select(dropdown);
	     s.selectByVisibleText("10");
	     
	     dropdown= driver.findElement(By.id("year"));
	     s= new Select(dropdown);
	     s.selectByVisibleText("2000");
	     
	     driver.findElement(By.name("sex")).click();
	     
	     driver.findElement(By.name("websubmit")).click();
	     
	     
	   
	}

}

	

