package PageObjectModelProject.com.TestCases;

import org.testng.annotations.Test;

import PageObjectModelProject.com.test.pages.LogPage;

public class TC01 extends BeforeAndAfter{
	
	@Test
	  public void basicLogin() throws Exception
	  {
		  LogPage loginpage =  new LogPage(driver);
		  loginpage.login("Abhilash.giridharan@ust-global.com", "Lost@123");
		  
	  }

}
