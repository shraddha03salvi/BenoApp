package runner;


import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue= {"stepDefination"},monochrome = true,
plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json",
		"html:target/cucumber-html-report"} )

  public class TestRunner extends AbstractTestNGCucumberTests 
{
	
//@Parameters({"operatingSystem","browser" ,"link"})
//	
//	@BeforeClass
//	public void beforeclass(String operatingSystem, String browser, String link, String user, String password )
//	{
//		TestDefaultValues.setOperatingSystem(operatingSystem);
//		TestDefaultValues.setBrowser(browser);
//		TestDefaultValues.setLink(link);
//		
//	}


}