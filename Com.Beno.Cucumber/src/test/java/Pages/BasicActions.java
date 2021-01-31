package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicActions {

	public static final int Time_OUT = 12;
	public WebDriver driver;
	public WebDriverWait wait;

	public BasicActions(WebDriver driver)

	{
		this.driver = driver;

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, Time_OUT), this);

		wait = new WebDriverWait(driver, Time_OUT);

	}
	public void click(WebElement element) {
		element.click();

	}
	public void PickUpTextField(WebElement element) {
		element.sendKeys("Dubai");
		
	}
	public void DropOffTextfield(WebElement element) {
		element.sendKeys("Dubai");
		
	}
	public void checkElementPresent(WebElement element)

	{
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	public void web(WebElement element) {
		
		element.sendKeys("14:30");
	}
	public void web1(WebElement element) {
		
		element.sendKeys("15:30");
	}
	public WebDriver getDriver() {
		return driver;

	}
}
