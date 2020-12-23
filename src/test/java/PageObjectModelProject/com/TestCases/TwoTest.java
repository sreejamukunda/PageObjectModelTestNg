package PageObjectModelProject.com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModelProject.com.test.common.BaseTest;
import PageObjectModelProject.com.test.pages.HomPage;
import PageObjectModelProject.com.test.pages.LogPage;

public class TwoTest {
	
	WebDriver driver;
	String browsertype="chrome";
	String url="https://ui.freecrm.com";
	
	@BeforeTest
	public void setData()
		{
			
		driver=BaseTest.startApp(browsertype);////Creating and getting the instance of the driver
		//if not getting ,our driver value will be null
		
			BaseTest.startUrl(url);
		}
  @Test(priority=1)
  public void basicLogin() throws Exception
  {
	   LogPage loginpage =  new LogPage(driver);
	 
	  loginpage.login("Abhilash.giridharan@ust-global.com", "Lost@123");
	 
	 
  }

  
  @Test(priority=2)
  public void basicLogout() throws Exception
  {
	   
	 
	 HomPage home =  new HomPage(driver);
	 home.Logout();
	 
  }
}
