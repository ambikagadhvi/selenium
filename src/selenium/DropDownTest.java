package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/"); 
		
		Thread.sleep(15000);
		
		List<WebElement> allOption = driver.findElements(By.xpath("//select[@id='gh-cat' and@ name='_sacat']/option"));
            System.out.println(allOption.size());
            
            //for (int i= 0; i<allOption.size(); i++) {
            	// System.out.println(allOption.get(0).getText()+ "---------"+allOption.get(0).isSelected());
           // }
             //Print Only when the option is selected
            
            WebElement DropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
            Select s = new Select( DropDown);
           
            s.selectByIndex(0);
            Thread.sleep(4000);
            
            for(int i= 0; i<allOption.size(); i++) {
            	if (allOption.get(i).isSelected()) {
            		System.out.println(allOption.get(i).getText()+"---------"+allOption.get(i).isSelected());   
            		//allOption.get(i).isSelected()) is used to check weather the item is selected or not
                    
                    
            	}
            }
            
            //s.selectByValue("15032");
            //Thread.sleep(4000);
            
            System.out.println("---------------------------");
            
            s.selectByVisibleText("Books");
            /*for (int i= 0; i<allOption.size(); i++) {
        	System.out.println(allOption.get(0).getText()+ "---------"+allOption.get(0).isSelected());
       }
            System.out.println(allOption.get(0).getText()+ "---------"+allOption.get(0).isSelected());*/
            
            for(int i= 0; i<allOption.size(); i++) {
            	if (allOption.get(i).isSelected()) {
            		System.out.println(allOption.get(i).getText()+"---------"+allOption.get(i).isSelected());
                    
            	}
            }
            	
            	
	}

}
