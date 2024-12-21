package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(10000);
		
		List<WebElement>RadioButton = driver.findElements(By.name("group1"));
		System.out.println(RadioButton.size());
		
		 for(int i= 0; i<RadioButton.size(); i++) {
         	System.out.println(RadioButton.get(i).getAttribute("value")+"-------"+RadioButton.get(i).isSelected());
         	//By default which radio button is selected,it will be true for it.
         }

			driver.findElement(By.xpath("input[@value='Cheese']")).click();
			RadioButton.get(2).click();
			//By above 2 methods we can find and click on Cheese button
			System.out.println("-----------");

			for (int i = 0; i < RadioButton.size(); i++) {
				System.out.println(
						RadioButton.get(i).getAttribute("value") + "-------" + RadioButton.get(i).isSelected());
				//In this loop Cheese is True and other all are false
			}
		}
	}
