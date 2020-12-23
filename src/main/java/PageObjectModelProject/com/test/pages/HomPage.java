package PageObjectModelProject.com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectModelProject.com.test.common.WebHandlers;

public class HomPage {

public  WebDriver driver;
	

	public HomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Contacts']")
	WebElement contact;
	@FindBy(xpath = "//i[@class='settings icon']")
	WebElement setting;
	@FindBy(xpath = "//span[text()='Log Out']")
	WebElement logout;

	public void contactClick()
	{
		WebHandlers.clickElement(contact);
		
	}

	public void Logout() throws Exception {

		
		WebHandlers.clickElement(setting);
		WebHandlers.clickElement(logout);
		Thread.sleep(2000);
		
	}

public boolean contactDisplay() {

		
		return WebHandlers.verifyDisplayed(contact);
		
	}

public String getTextofContact() {

	
	return WebHandlers.getText(contact);
	
}

	
}
