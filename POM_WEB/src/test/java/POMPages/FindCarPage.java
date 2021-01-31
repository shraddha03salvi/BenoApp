package POMPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindCarPage 
{
	WebDriver driver;
	String Month;  String day; 
	String Month1; String day1; 
	// Declaration
			@FindBy(xpath="//input[@placeholder='Dubai, United Arab Emirates (DXB-Dubai Intl.)']")
			private WebElement PickUpTextField ;
			
		@FindBy(xpath="//ul[@role='listbox']//li/descendant::span[@class='ng-tns-c9-5 ng-star-inserted']")
			private List<WebElement> list1 ;
//			
			
			@FindBy(xpath="//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c7-1 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']//span[@class='ui-button-icon-left ui-clickable pi pi-calendar']")
			private WebElement PickDateCalendarIcon;
			
			@FindBy(className="ui-datepicker-title")
			private WebElement selection ;
			
			@FindBy(xpath="//span[@class='ui-datepicker-next-icon pi pi-chevron-right']")
			private WebElement RightArrow;
			
			@FindBy(xpath="//div[1]//div[2]//table[1]//tbody[1]//tr//td/a[contains(text(),'10')]")
			private WebElement DateSelect;
			
			@FindBy(xpath="//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c7-3 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']//span[@class='ui-button-icon-left ui-clickable pi pi-calendar']")
			private WebElement DropDateCalendarIcon;
		
			@FindBy(className="ui-datepicker-title")
			private WebElement DropDateSelect;
			
			@FindBy(xpath="//span[@class='ui-datepicker-next-icon pi pi-chevron-right']")
			private WebElement RightArrow1;
			
		@FindBy(xpath="//div[1]//div[2]//table[1]//tbody[1]//tr//td/a[contains(text(),'11')]")
			private WebElement dropDate;
			
		@FindBy(xpath="//input[@class='ng-tns-c7-2 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
		private WebElement pickupTime;
		
		@FindBy(xpath="//input[@class='ng-tns-c7-4 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
		private WebElement DropOffTime;
		
			@FindBy(xpath="//*[text()='FIND CAR']")
			private WebElement FindCarButton;
		
			//initialization
			
			public FindCarPage (WebDriver driver) 
			{
				PageFactory.initElements(driver,this); 
				
			}
			//utilization
			public void CLickPickUpTextField() {
				
				PickUpTextField.sendKeys("Dubai");
				List<WebElement> list = list1;
				
				 System.out.println("Total number of suggestions:" + list.size());
				 for(int i =0;i<list.size();i++) 
				 {
					System.out.println(list.get(i).getText());
					if(list.get(i).getText().contains("Dubai Mall")) 
					{
						list.get(i).click();
						break;
					}
					 
				 }
			}
			public void PickUpDate() throws InterruptedException {
				
				 Month = "July2020";
				 //day ="10";
				 PickDateCalendarIcon.click();
				 Thread.sleep(2000);
				 while(true) 
					{
					 WebElement web1= selection;
					 web1.getText();
			if( web1.getText().equals(Month)) 
					{
					break;
					}else 
					{
						RightArrow.click();
					}
						
			}
				 DateSelect.click();
				 
			}
			 public void DropOffDate() throws InterruptedException {
				 Month1 = "August2020";
				  //day1 ="11";
				 DropDateCalendarIcon.click();
				 Thread.sleep(2000);
					while(true) 
					{
           WebElement web =DropDateSelect;
         web.getText();
					if(web.getText().equals(Month1)) 
					{
					break;
					}else 
					{
						RightArrow1.click();
					}	 
				 
			 }
					 dropDate.click();	
				 
			 }
			 public void PickUpTime() throws InterruptedException {
				 
				 WebElement web= pickupTime;
				 Thread.sleep(2000);
				 web.sendKeys(Keys.BACK_SPACE);
				 web.sendKeys(Keys.BACK_SPACE);
				 web.sendKeys(Keys.BACK_SPACE);
				 web.sendKeys(Keys.BACK_SPACE);
			 web.sendKeys(Keys.BACK_SPACE);
				 Thread.sleep(3000);
				 web.sendKeys("14:30");
				 Thread.sleep(3000);
			 }
			 public void DropOffTime() throws InterruptedException {
		WebElement web=	DropOffTime;	 
		Thread.sleep(2000);
		 web.sendKeys(Keys.BACK_SPACE);
		 web.sendKeys(Keys.BACK_SPACE);
		 web.sendKeys(Keys.BACK_SPACE);
		 web.sendKeys(Keys.BACK_SPACE);
	web.sendKeys(Keys.BACK_SPACE);
		 Thread.sleep(3000);
		 web.sendKeys("15:30");
		 Thread.sleep(3000);
			 }
			 public void FindCarButton() {
				 FindCarButton.click();
			 }
			

}
