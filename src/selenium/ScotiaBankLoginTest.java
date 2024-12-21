package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=l0H_A-X8X0s&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJ1aV9sb2NhbGVzIjoiZW4tVVMiLCJvYXV0aF9rZXkiOiJsMEhfQS1YOFgwcyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvc2VjdXJlLnNjb3RpYWJhbmsuY29tXC9hdXRoXC9hdXRob3JpemF0aW9uIiwic3RhdGUiOiJleUp5WlhSMWNtNVZVa2tpT2lKb2RIUndjem92TDNObFkzVnlaUzV6WTI5MGFXRmlZVzVyTG1OdmJTOGlMQ0p2Y21sbmFXNWhiRkpsWm1WeVpYSWlPaUpvZEhSd2N6b3ZMM2QzZHk1elkyOTBhV0ZpWVc1ckxtTnZiUzhpTENKamJHbGxiblJKVUNJNmJuVnNiQ3dpWTNOeVpsUnZhMlZ1SWpvaVQxZHZZMDB4TkVZdFpWaDRPV2xpY2xwc1JteGZTMU5XU214S1kyWkphWHB5ZURWTkluMCUzRCIsImV4cCI6MTY3NTAyNTIzOCwiaWF0IjoxNjc1MDI0MDM4LCJqdGkiOiJlMDA2ZTlhNC1iZDVlLTQ2ZmEtYjBiNy0xYTQ1ZWRlZTJmNzkiLCJjbGllbnRfaWQiOiI0ZWNmN2UzOS1iZTU2LTRhNjYtODE2Yy0xM2NiOTRlNjJkYTUiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiTW9iaWxlIiwiQXBwbGljYXRpb25Db2RlIjoiSW1XQVAiLCJjdXN0b21lckFjdGl2aXR5Q2F0ZWdvcnkiOiJNMSIsImNoYW5uZWwiOiJNQiIsImFwcGxpY2F0aW9uIjoiTTEifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.FYh7nayIu-hKYdjtFoYdBQZsWP1MRtb7Niu4ilCzHNoAz3uKwNlo-wXeOjVV1nsWDJvFGud0OB62QnsjFjUD0u0LEbEwiCxBvpLWmlMmYSd4AynikovTUKXDL71LMrTdNjJ-9Q-N1KF92y3T1Xoza_KHZw7i857Zkz-sPdBvq0kn13VYoHHjtZIRgo07HvZb0Ixo-LtgdppYtq-aCtV-uD1PgnRlpsv9TbsvZXLv4uT85TCrPSzEN3Ix56j_-PJu_XEDW-oSjE4cVTGbpTHZNWxhDm1ON-do8ffluNZAI2OyFyiIFyC7KD34EAqAIwVm-S5XLX9zVKmkJX_hdFO_yw");
		
		driver.findElement(By.name("usernameInput")).sendKeys("gfkdgfkugfkgfgfh2454@#$$$");
		driver.findElement(By.name("password")).sendKeys("gufgluigflugfasg");
		driver.findElement(By.id("signIn")).click();
		
		
		
		Thread.sleep(2000);
		
		String expectedErr= "Please enter a username or card number without special characters.";
		
		String actuatErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actuatErr);
		
		if (expectedErr.equals(actuatErr)){
			System.out.println("Your First test pass");
		}else {
			System.out.println("Your First test Fail");
		}
	}
	

}
