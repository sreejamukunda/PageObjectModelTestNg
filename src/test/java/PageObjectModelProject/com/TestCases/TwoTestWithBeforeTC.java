package PageObjectModelProject.com.TestCases;

import org.testng.annotations.Test;

import PageObjectModelProject.com.test.pages.HomPage;
import PageObjectModelProject.com.test.pages.LogPage;

public class TwoTestWithBeforeTC extends BeforeTwoTest{
	
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
