package PageObjectModelProject.com.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import PageObjectModelProject.com.test.common.BaseTest;

public class BeforeTwoTest extends BaseTest{
	
	public String browsertype="Chrome";
	//public String url;
	public String url="https://ui.freecrm.com";
	 
	//@Parameters("url") 
	@BeforeTest
	  public void beforeTest() 
	  {
		 driver= startBrowser(url,browsertype);
	  
	  }
	 
	  @AfterTest
	  public void afterTest()
	  {
		  closeBrowser();
		  
	  }



}
