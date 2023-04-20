package pageFactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
//		PageFactory.initElements(driver, this); //this init Elements will create all webelements
	}
	
	//get the user name from HomePage
	public String getHomePageTitle()
	{
		System.out.println("The window title is " + driver.getTitle());
		return driver.getTitle();
	}
}
