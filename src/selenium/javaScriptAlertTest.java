package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaScriptAlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		//When there is a Confirm box and its a java alert Script code and we cannot inspect it as its not a html code
		//then we use this Syntax.  IT ALWAYS HAVE ONLY 2 OPTIONS
		//                 driver.switchTo().alert();
		
		
		/*Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		//al.accept();  // Its for Selected Button
		al.dismiss();  // For Non Selected Button*/
		

      Alert am = driver.switchTo().alert();
      System.out.println(am.getText());
      //am.dismiss();;
      am.accept();
	}

}