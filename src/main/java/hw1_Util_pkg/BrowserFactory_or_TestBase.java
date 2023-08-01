
package hw1_Util_pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocationContext;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.Interactive;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory_or_TestBase {


	
	
	// Connections between WebDriver, ChromeDriver, RemoteDriver, and TakesScreenshot:
		// 1. public interface WebDriver extends SearchContext
		// 2. public class ChromeDriver extends RemoteWebDriver implements LocationContext, WebStorage, HasTouchScreen, NetworkConnection 
		// 3. public class RemoteWebDriver implements WebDriver, JavascriptExecutor, FindsById, FindsByClassName, FindsByLinkText, FindsByName,
    			// FindsByCssSelector, FindsByTagName, FindsByXPath, HasInputDevices, HasCapabilities, Interactive, TakesScreenshot
			

	// ========== =============== =============== ============ =============== =============== ============ =============== =============== ============
	
	
	
	public static WebDriver driver;
	static String browser;
	static String url;
	
	public static void readConfig() {
	
		try {
			
			InputStream input = new FileInputStream("src/main/java/config/hw1CucumberConfig.properties");
			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");			
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static WebDriver initDriver() {
		
		readConfig();
		if(browser.equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.getProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Use appropriate browser!!!");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void takeScreenshot(WebDriver driver) {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;   
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
			
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
