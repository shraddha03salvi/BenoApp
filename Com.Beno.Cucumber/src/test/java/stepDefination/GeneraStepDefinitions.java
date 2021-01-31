package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneraStepDefinitions {

	public static WebDriver driver;
	@Before
	public void openBrowsrwithLink() {
		 System.setProperty("webdriver.chrome.driver","/Users/benotechnologies/Downloads/Installed_Software/Driver/chromedriver");
		  
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://stg.beno.com");
		 
	}
	@After
	public void CloseBrowser() {
		driver.quit();
	}

	public static WebDriver getDriver() {
		return driver;

	}
}
