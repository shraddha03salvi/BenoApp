package POMPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {

	
	WebDriver driver;
	@FindBy(xpath="//*[text()='View Deal']")
	private WebElement ViewDeal;
	
	@FindBy(xpath="//button[@class='btn d-flex text-left btn-lg btn-success mr-2']")
	private WebElement BookwithFullPro;

	
	public ListingPage (WebDriver driver) 
	{
		PageFactory.initElements(driver,this); 
		
	}
	
	public void ViewDeal(){
		 
		
		ViewDeal.click();
	}
	public void BookwithFullPro() {
		
		BookwithFullPro.click();
	}
}
