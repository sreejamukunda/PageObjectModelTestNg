package PageObjectModelProject.com.test.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandlers {
	
	public static WebDriverWait wait;
	
	
	public static void clickwait(WebElement ele)
	{
		wait = new WebDriverWait(BaseTest.getDriver(),30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	public static void enterWait(WebElement ele)
	{
		wait = new WebDriverWait(BaseTest.getDriver(),30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
	}
	
	
	public static void alertWait()
	{
		wait = new WebDriverWait(BaseTest.getDriver(),30);
		wait.until(ExpectedConditions.alertIsPresent());
	}


}
