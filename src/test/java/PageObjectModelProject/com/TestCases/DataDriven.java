package PageObjectModelProject.com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModelProject.com.test.common.BaseTest;
import PageObjectModelProject.com.test.pages.HomPage;
import PageObjectModelProject.com.test.pages.LogPage;
import PageObjectModelProject.com.test.util.ExcelOperations;

public class DataDriven {
	
	WebDriver driver;
	String browsertype="chrome";
	String url="https://ui.freecrm.com";
	static String fileName="Data";
	
	@BeforeTest
	public void setData()
		{
			
			driver=BaseTest.startBrowser(url,browsertype);
		}
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		return ExcelOperations.readData(fileName);

	}

  @Test(dataProvider = "fetchData")
  public void basicLogin(String username, String password) throws Exception
  {
	  LogPage loginpage =new LogPage(driver);
	  
	//  LogPage loginpage =  PageFactory.initElements(driver,LogPage.class); 
	  loginpage.login(username,password);
	 // HomPage home =  PageFactory.initElements(driver,HomPage.class);
	  HomPage home=new HomPage(driver);
	  home.Logout();
	 // String[][] data = sendData();
//	  System.out.println(data[1][2]);
		
  }


}
