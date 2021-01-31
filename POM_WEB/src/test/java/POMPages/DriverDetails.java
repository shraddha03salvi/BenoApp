package POMPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DriverDetails {

	WebDriver driver;
	@FindBy(xpath="//label[@class='ng-tns-c4-18 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")
	private WebElement Title;
	
	@FindBy(xpath="//ul[@role='listbox']//li/descendant::span[@class='ng-tns-c4-18 ng-star-inserted']")
	private List<WebElement> list1 ;
	
	@FindBy(id="firstName")
	private WebElement FirstName;
	
	@FindBy(xpath="//*[text()='Surname']")
	private WebElement SurName;
	
	@FindBy(xpath="//*[text()='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//*[text()='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy(id="consentCheckBox")
	private WebElement UseEmaiId;
	
	@FindBy(xpath="//*[text='Book Now']")
	private WebElement BookNow;
	
	
	public  DriverDetails(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void title() {
		Title.click();
		List<WebElement> list = list1;
		System.out.println("Total number of suggestions:" + list.size());
		 for(int i =0;i<list.size();i++) 
		 {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Mrs.")) 
			{
				list.get(i).click();
				break;
			}
			 
		 }
		
	}
	public void FirstName() {
		
		FirstName.sendKeys("Shraddha");
	}
	public void SurName() {
		SurName.sendKeys("Salvi");
		
	}
	public void Email() {
		
		Email.sendKeys("salvi@gmail.com");
	}
	public void PhoneNumber()
	{
		phoneNumber.sendKeys("0508345612");
		
	}
	public void CheckThroughEmail() {
		
		UseEmaiId.click();
	}
	public void BookNow() {
		BookNow.click();
	}
}
