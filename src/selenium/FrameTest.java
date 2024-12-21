package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();

		List<WebElement> Link_present = driver.findElements(By.linkText("Sortable"));
		System.out.println(Link_present.size());
        
		List<WebElement> Drag_box = driver.findElements(By.id("draggable"));
		System.out.println(Drag_box.size());

		if (Link_present.size() > 0) {
			System.out.println("Its there");
		} else {
			System.out.println("Not present");
		}
        System.out.println("-----------------------For dragbox--------------------");//This Element is not present
		if (Drag_box.size()> 0) {
			System.out.println("Its there");
		} else {
			System.out.println("Not present");
		}
		
		driver.switchTo().frame(0);//index
		//driver.switchTo().frame("");//used only with the name or id
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	
		
		System.out.println("---------------After Swutching----------------");
		
		 Link_present = driver.findElements(By.linkText("Sortable"));
		System.out.println(Link_present.size());
        
		Drag_box = driver.findElements(By.id("draggable"));
		System.out.println(Drag_box.size());

		if (Link_present.size() > 0) {
			System.out.println("Its there");
		} else {
			System.out.println("Not present");
		}
        System.out.println("-----------------------For dragbox--------------------");//This Element is not present
		if (Drag_box.size()> 0) {
			System.out.println("Its there");
		} else {
			System.out.println("Not present");
		}
		
		System.out.println("------------For Switchingto main page again---------");
		
		driver.switchTo().defaultContent();//Will reach to main page  
		
		 Link_present = driver.findElements(By.linkText("Sortable"));
			System.out.println(Link_present.size());
	        
			Drag_box = driver.findElements(By.id("draggable"));
			System.out.println(Drag_box.size());

			if (Link_present.size() > 0) {
				System.out.println("Its there");
			} else {
				System.out.println("Not present");
			}
	        System.out.println("-----------------------For dragbox--------------------");//This Element is not present
			if (Drag_box.size()> 0) {
				System.out.println("Its there");
			} else {
				System.out.println("Not present");
			}
	}
	

}


