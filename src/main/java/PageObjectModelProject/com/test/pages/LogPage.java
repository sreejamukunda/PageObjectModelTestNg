package PageObjectModelProject.com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectModelProject.com.test.common.WebHandlers;

public class LogPage {
	
	public WebDriver driver;

	@FindBy(name = "email")
	WebElement User;

	@FindBy(name = "password")
	WebElement Pass;

	@FindBy(xpath = "//div[text()='Login']")
	WebElement submit;
	
	public LogPage(WebDriver driver){
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	   }
	
public void login(String Username,String Password) 
{
	WebHandlers.enterData(User,Username);
	WebHandlers.enterData(Pass,Password);
	WebHandlers.clickElement(submit);
	

}


}
