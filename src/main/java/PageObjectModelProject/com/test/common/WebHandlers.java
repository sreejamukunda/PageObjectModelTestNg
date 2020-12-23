package PageObjectModelProject.com.test.common;



import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class WebHandlers {
	
	
	
	public static void clickElement(WebElement ele) {
		try {
			
			WaitHandlers.clickwait(ele);
			ele.click();
		}catch(NoSuchElementException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			Assert.fail();
		}

	}
	
	
	
	//Enter Data in TextBox
		public static void enterData(WebElement ele, String Data) {
			try
			{
			
				
				WaitHandlers.enterWait(ele);
				ele.clear();
				ele.sendKeys(Data);
			
			}
			catch(ElementNotInteractableException e)
			{
				e.printStackTrace();
			}
			catch(NoSuchElementException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
		//Gettign the text from the element
		public static String getText(WebElement ele)
		{
			return ele.getText();
		}
		
		
		//Dropdown
		public static void selectDropDownUsingText(WebElement ele, String value) {

			Select dropdown=new Select(ele);
			dropdown.selectByVisibleText(value);
		}

		public static boolean verifyDisplayed(WebElement ele) {
			try {
				return ele.isDisplayed();
			} catch (Exception e) {
				return false;
			} 
			//return false;

		}

		public static void acceptAlert() {
					
			try {
				
				Alert alert = BaseTest.getDriver().switchTo().alert();
				alert.accept();
				
			} catch (NoAlertPresentException e) {
				System.out.println("There is no alert");
			} 


}
		
		
		
}