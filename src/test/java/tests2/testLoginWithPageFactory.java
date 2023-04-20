package tests2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactory2.HomePage;
import pageFactory2.Login;



public class testLoginWithPageFactory {

	WebDriver driver;
	Login objLogin;
	HomePage objHomePage;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void test_Home_Page_Appear_Correct() throws InterruptedException
	{
		objLogin = new Login(driver);

		objLogin.loginToApplication("admin", "admin123");
		//go to next page
		objHomePage = new HomePage(driver);
		//verify the home page title
		Assert.assertEquals(objHomePage.getHomePageTitle(), "OrangeHRM" );
		driver.quit();
	}
	
}
