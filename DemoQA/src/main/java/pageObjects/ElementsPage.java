package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ElementsPage
{	
	@FindBy(xpath = "//div[@class='category-cards']//h5[text()='Elements']") 
	public static WebElement elementsLink; 
	
	public ElementsPage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateToElementsPage()
	{
		elementsLink.click();
	}
	
}
