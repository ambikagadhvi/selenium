package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");
		Actions builder = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement drag_me = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    System.out.println(drop.getText()); // Drop here
	    
	    builder.dragAndDrop(drag_me, drop).build().perform();
// To verify
	    
	    
	    /*System.out.println(drop.getText()); //dropped
	    
	    if (drop.getText().equals("Dropped!")) {
	    	System.out.println("pass");
	    	
	    }else {
	    	System.out.println("fail");
	    }*/
	}

}