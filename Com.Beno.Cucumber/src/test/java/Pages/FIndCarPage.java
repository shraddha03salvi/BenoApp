package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FIndCarPage extends BasicActions {

	
	String Month;  String day; 
	String Month1; String day1; 

	@FindBy(xpath="//input[@placeholder='Dubai, United Arab Emirates (DXB-Dubai Intl.)']")
	private WebElement PickUpTextField ;
	
@FindBy(xpath="//ul[@role='listbox']//li/descendant::span[@class='ng-tns-c8-6 ng-star-inserted']")
	private List<WebElement> list1 ;
//	
  @FindBy(xpath="//div[@class='ui-g-12']//div[@class='ui-chkbox ui-widget']")
	private WebElement checkbox;
  
  @FindBy(xpath="/html[1]/body[1]/app-root[1]/app-homepage[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/app-advanced-search[1]/div[1]/div[1]/div[1]/div[3]/app-locations[1]/p-autocomplete[1]/span[1]/input[1]")
  private  WebElement DropOffTextfield;
  
  @FindBy(xpath="//ul[@role='listbox']//li/descendant::span[@class='ng-tns-c8-7 ng-star-inserted']")
  private List<WebElement> ele1;
  
	@FindBy(xpath="//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c6-2 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']//span[@class='ui-button-icon-left ui-clickable pi pi-calendar']")
	private WebElement PickDateCalendarIcon;
	
	@FindBy(className="ui-datepicker-title")
	private WebElement selection ;
	
	@FindBy(xpath="//span[@class='ui-datepicker-next-icon pi pi-chevron-right']")
	private WebElement RightArrow;
	
	@FindBy(xpath="//div[1]//div[2]//table[1]//tbody[1]//tr//td/a[contains(text(),'10')]")
	private WebElement DateSelect;
	
	@FindBy(xpath="//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c6-4 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']//span[@class='ui-button-icon-left ui-clickable pi pi-calendar']")
	private WebElement DropDateCalendarIcon;

	@FindBy(className="ui-datepicker-title")
	private WebElement DropDateSelect;
	
	@FindBy(xpath="//span[@class='ui-datepicker-next-icon pi pi-chevron-right']")
	private WebElement RightArrow1;
	
@FindBy(xpath="//div[1]//div[2]//table[1]//tbody[1]//tr//td/a[contains(text(),'11')]")
	private WebElement dropDate;
	
@FindBy(xpath="//input[@class='ng-tns-c6-3 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
private WebElement pickupTime;

@FindBy(xpath="//input[@class='ng-tns-c6-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
private WebElement DropOffTime1;

	@FindBy(xpath="//*[text()='FIND CAR']")
	private WebElement FindCarButton;
	

	//initialization
	
	public FIndCarPage(WebDriver driver) 
	{
		super(driver);
	}
	public FIndCarPage checkElementPresent () {
		checkElementPresent(FindCarButton);
		return this;
		
		
	}
	public FIndCarPage ValidateFindCarfunctionality() throws Throwable  {
		
		PickUpTextField(PickUpTextField);
		Thread.sleep(1000);
		List<WebElement> list = list1;
		
		 System.out.println("Total number of suggestions:" + list.size());
		 for(int i =0;i<list.size();i++) 
		 {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Dubai Internet City")) 
			{
				list.get(i).click();
				break;
			}
			 
		 }
		

		return this;
		
		
	}
	public FIndCarPage ValidateDropOffLocation() throws Throwable {
		
		 click(checkbox);
		 Thread.sleep(1000);
		 DropOffTextfield(DropOffTextfield);
		  Thread.sleep(2000);
		  List<WebElement> ele = ele1;
			
			 System.out.println("Total number of suggestions:" + ele.size());
					 for(int j =0;j<ele.size();j++) 
					 {
						System.out.println(ele.get(j).getText());
						
						if(ele.get(j).getText().contains("Dubai Mall")) 
						{
							ele.get(j).click();
							break;					}
						 
					 }
					return this;

	}
	public FIndCarPage ValidatePickUpDateTime() throws Throwable {
		 Month = "July2020";
		 //day ="10";
		 click(PickDateCalendarIcon);
		 Thread.sleep(2000);
		 while(true) 
			{
			 WebElement web1= selection;
			 web1.getText();
	if( web1.getText().equals(Month)) 
			{
			break;
			}
	else {
		click(RightArrow);
	   }
	}
		 click(DateSelect);
		 Thread.sleep(1000);
		 WebElement web= pickupTime;
		 Thread.sleep(2000);
		 web.sendKeys(Keys.BACK_SPACE);
		 web.sendKeys(Keys.BACK_SPACE);
		 web.sendKeys(Keys.BACK_SPACE);
		 web.sendKeys(Keys.BACK_SPACE);
	 web.sendKeys(Keys.BACK_SPACE);
		 Thread.sleep(3000);
	 web(web);
	 Thread.sleep(2000);
		return this;
		
	}
	public FIndCarPage ValidateDropOffDateTime() throws Throwable {
		Month1 = "August2020";
		 //day1 ="11";
		click(DropDateCalendarIcon);
		 Thread.sleep(2000);
		 while(true) 
			{
WebElement web =DropDateSelect;
web.getText();
			if(web.getText().equals(Month1)) 
			{
			break;
			}else {
				click(RightArrow1);
			}
			}
		 click(dropDate);
		 WebElement web1=	DropOffTime1;	 
			Thread.sleep(2000);
			 web1.sendKeys(Keys.BACK_SPACE);
			 web1.sendKeys(Keys.BACK_SPACE);
			 web1.sendKeys(Keys.BACK_SPACE);
			 web1.sendKeys(Keys.BACK_SPACE);
		web1.sendKeys(Keys.BACK_SPACE);
			 Thread.sleep(3000);
			 web1(web1);
			 Thread.sleep(2000);
		return this;
		
		
	}
		public FIndCarPage ValidateFindCar() throws Throwable {
			click(FindCarButton);
			Thread.sleep(5000);
			return this;
			
			
		}
		public FIndCarPage ValidateTime(String PickUpTime, String DropOffTime) throws Throwable {
			WebElement web2= pickupTime;
			 Thread.sleep(2000);
			 web2.sendKeys(Keys.BACK_SPACE);
			 web2.sendKeys(Keys.BACK_SPACE);
			 web2.sendKeys(Keys.BACK_SPACE);
			 web2.sendKeys(Keys.BACK_SPACE);
		 web2.sendKeys(Keys.BACK_SPACE);
			 Thread.sleep(3000);
		 web2.sendKeys(PickUpTime);
		 Thread.sleep(3000);
		 WebElement web3=	DropOffTime1;	 
			Thread.sleep(2000);
			 web3.sendKeys(Keys.BACK_SPACE);
			 web3.sendKeys(Keys.BACK_SPACE);
			 web3.sendKeys(Keys.BACK_SPACE);
			 web3.sendKeys(Keys.BACK_SPACE);
		web3.sendKeys(Keys.BACK_SPACE);
			 Thread.sleep(3000);
			 web3.sendKeys(DropOffTime);
			 Thread.sleep(2000);
		 
			return this;
			
		}
}
