package PageObjectModelProject.com.test.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	
	public static WebDriver driver;	
	//changes in sreejabranch
	
	public static String driverPathChrome = "C:/Selenium Greens/SeleniumProject/Drivers/chromedriver.exe";
	public static String driverPathFf = "C:/Selenium Greens/SeleniumProject/Drivers/geckodriver.exe";
	public static String driverPathIe = "C:/Selenium Greens/SeleniumProject/Drivers/IEDriverServer.exe";

	public static WebDriver startBrowser(String url,String browserType)

	{

		switch (browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPathChrome);
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			break;
			

		case "firefox":
			System.setProperty("webdriver.gecko.driver", driverPathIe);
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			break;

		case "IE":
			System.setProperty("webdriver.ie.driver", driverPathIe);
			driver = new InternetExplorerDriver();
			driver.get(url);
			driver.manage().window().maximize();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", driverPathChrome);
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			

		}
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		setDriver(driver);
		return driver;
	}

	public static WebDriver startApp(String browserType) {
		try {
			if(browserType.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", driverPathChrome);
				driver = new ChromeDriver();//creating instance of driver
				
			} else if(browserType.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", driverPathFf);
				driver = new FirefoxDriver();
				
			} else if(browserType.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", driverPathIe);
				driver = new InternetExplorerDriver();
				
			}
				
		} 
		catch (Exception e) {System.out.println("Browser could not be started");}
		return driver;
		
	}

	public static void startUrl( String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BaseTest.driver = driver;
	}

		
	public static void closeBrowser() 
	{
		driver.close();
	}

}



