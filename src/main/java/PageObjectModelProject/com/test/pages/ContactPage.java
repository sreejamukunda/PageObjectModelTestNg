package PageObjectModelProject.com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectModelProject.com.test.common.WebHandlers;

public class ContactPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	WebElement newc;
		
  
	public ContactPage(WebDriver driver)
	{
		
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	public void newContactclick() {
		
	WebHandlers.clickElement(newc);	
			
	}
	

}
