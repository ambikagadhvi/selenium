package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		//1.As class name has space inside it so we cannot use classname here
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hgksdgvksdgkjsd");
         
		//2. CSS Selector has syntax- will check
		
		//3. id(id attribute is working)
		driver.findElement(By.id("email")).sendKeys("fjahfjhagfgfgdfg");
		
		//4.Linktext- Its only for links, and link starts from <a>.
		//driver.findElement(By.linkText(null))
		
		
		//5. By name attribute is working
				driver.findElement(By.name("email")).sendKeys("gfliuagfliuegtfugy");
		
		//6. By partiallinktext- we cannot use it.
				//driver.findElement(By.linkText(null)
		//7. Tagname- Not unique
				
		//8. xpath- Syntax		
				
				
				
	//Password
				//driver.findElement(By.name("pass")).sendKeys("ufgsugflgsahyfhoi");
		driver.findElement(By.id("pass")).sendKeys("fgakgfkagfkgak"+Keys.ENTER);		
	//Login Button
				//driver.findElement(By.tagName("button")).click();
	}
		
		

	
}
