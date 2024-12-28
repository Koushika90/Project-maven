package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class CustomerModule {
	@Test
	
	public void createCampaign() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fb.com");
		
		System.out.println("The title of web page is  " +driver.getTitle());
		
		Reporter.log("createCampaign",true);
		
		driver.quit();
		
	}
	
}
