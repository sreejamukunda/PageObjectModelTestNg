package PageObjectModelProject.com.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModelProject.com.test.common.BaseTest;
import PageObjectModelProject.com.test.pages.ContactPage;
import PageObjectModelProject.com.test.pages.HomPage;
import PageObjectModelProject.com.test.pages.LogPage;

public class TC03 extends BeforeAndAfter{
	
	
		@Test
		  public void homecontact() throws Exception
		  {
			  WebDriver driver=BaseTest.getDriver();
			  ContactPage cont =  new ContactPage(driver);
			  cont.newContactclick();
		  
	  }

}
