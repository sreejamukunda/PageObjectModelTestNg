package PageObjectModelProject.com.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import PageObjectModelProject.com.test.common.BaseTest;


	
	//Beforeand After is followed by TC001 to TC004 where in the same browser the TC 1 to TC 4 is executed sequentially
	//.Here the Xml TC001 is used to run this with listener

//...
//...
//..
	public class BeforeAndAfter extends BaseTest {
	  WebDriver driver;
		
	public String browsertype="Chrome";
	//public String url="https://ui.freecrm.com";
	//public String url;
	 
	@Parameters({"url"})
	  @BeforeTest
	  public void beforeTest(String url) 
	  {
		  //Creating and getting the instance of the driver and also opening the browser
		driver= startBrowser(url,browsertype);
	  
	  }
	 
	  @AfterTest
	  public void afterTest()
	  {
		  closeBrowser();
		  
	  }



}
