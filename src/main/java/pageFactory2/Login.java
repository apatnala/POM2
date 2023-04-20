package pageFactory2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	
	WebDriver driver;
		
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//button")
	@CacheLookup
	WebElement loginButton;

	int sleep = 3000;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //this init Elements will create all webelements
	}
	
	//set user name in textbox
	public void setUserName(String strUsername) throws InterruptedException
	{
		Thread.sleep(sleep);
		username.sendKeys(strUsername);
	}
	
	//set password in textbox
	public void setPassword(String strPassword) throws InterruptedException
	{
		Thread.sleep(sleep);
		password.clear();
		password.sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickLogin() throws InterruptedException
	{
		Thread.sleep(sleep);
		loginButton.click();
	}		
		
	//login to the application
	public void loginToApplication(String strUserName, String strPassword) throws InterruptedException
	{
		//fill user name
		this.setUserName(strUserName);
		//fill password
		this.setPassword(strPassword);
		//click login button
		this.clickLogin();
	}
	
}
