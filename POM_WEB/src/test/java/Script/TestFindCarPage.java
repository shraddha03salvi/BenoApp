package Script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Generic.BaseTest;
import POMPages.DriverDetails;
import POMPages.FindCarPage;
import POMPages.ListingPage;

public class TestFindCarPage extends BaseTest {
	@Test
	public void TestFindCarPag() throws Throwable {
		FindCarPage F = new FindCarPage(driver);
		ListingPage L = new ListingPage (driver);
		DriverDetails D = new DriverDetails(driver);
		F.CLickPickUpTextField();
		Thread.sleep(2000);
	    F.PickUpDate();
		Thread.sleep(2000);
		F.DropOffDate();
		Thread.sleep(2000);
		F.PickUpTime();
		Thread.sleep(2000);
		F.DropOffTime();
		Thread.sleep(2000);
		F.FindCarButton();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 // WebElement element= ViewDeal;
		 
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  Thread.sleep(4000);
          L.ViewDeal();
		Thread.sleep(5000);
		L.BookwithFullPro();
		Thread.sleep(4000);
		D.title();
		Thread.sleep(3000);
		D.FirstName();
		Thread.sleep(3000);
		D.SurName();
		Thread.sleep(3000);
		D.Email();
		Thread.sleep(3000);
		D.PhoneNumber();
		Thread.sleep(3000);
		D.CheckThroughEmail();
		Thread.sleep(3000);
		D.BookNow();
		Thread.sleep(3000);
	}

}
