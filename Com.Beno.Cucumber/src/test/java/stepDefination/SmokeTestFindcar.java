package stepDefination;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.FIndCarPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTestFindcar {
	private WebDriver driver = GeneraStepDefinitions.getDriver();
	private FIndCarPage findcarpage;
	@Given("^User Select pickUp location from Search option$")
	public void user_Select_pickUp_location_from_Search_option() throws Throwable {
		findcarpage = new FIndCarPage(driver);
		findcarpage.ValidateFindCarfunctionality();
		
	}

	@Given("^User Select DropOff Location from Search option$")
	public void user_Select_DropOff_Location_from_Search_option() throws Throwable {
		findcarpage = new FIndCarPage(driver);
		findcarpage.ValidateDropOffLocation();
	}

	@When("^User select PickUp Date and Time$")
	public void user_select_PickUp_Date_and_Time() throws Throwable {
		
		findcarpage = new FIndCarPage(driver);
		findcarpage.ValidatePickUpDateTime();
	

	}

	@When("^User Select DropOff Date and Time$")
	public void user_Select_DropOff_Date_and_Time() throws Throwable {
		findcarpage = new FIndCarPage(driver);
		findcarpage.ValidateDropOffDateTime();
	}

	@Then("^User click on Find Car Button and Navigate to Listing page$")
	public void user_click_on_Find_Car_Button_and_Navigate_to_Listing_page() throws Throwable {
		
		findcarpage = new FIndCarPage(driver);
		findcarpage.ValidateFindCar();
	}

	@When("^User Click on \"([^\"]*)\"and \"([^\"]*)\" Text field$")
	public void user_Click_on_and_Text_field(String PickUpTime, String DropOffTime) throws Throwable {
		findcarpage = new FIndCarPage(driver);
		findcarpage.ValidateTime(PickUpTime, DropOffTime);
	}

	@Then("^User able to Select PickUp time$")
	public void user_able_to_Select_PickUp_time() throws Throwable {
		findcarpage.checkElementPresent();
	    System.out.println("User able to select time");
	}


	
	

}
