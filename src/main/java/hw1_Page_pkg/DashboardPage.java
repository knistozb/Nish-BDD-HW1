
// Selenium Class 11.d:- July 16, 2023, Sunday with Instructor Shihabul Khandakar (Shibab) 

package hw1_Page_pkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage extends BasePage {

	
	
	
	
	
	
	
	
	// ==========================================================================

	WebDriver driver;
	WebDriverWait wait;

	
	// parameterizing the constructor to save it under a variable and globally declare in this class
	public DashboardPage(WebDriver driver) {
			
		this.driver = driver;
	}

	// WebElements:
	@FindBy(how = How.XPATH, using = "//div[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_VALIDATION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BANK_AND_CASH_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//ul[@id=\"side-menu\"]/li[10]/ul/li[1]/a[1]") WebElement NEW_ACCOUNT_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using= "//a[@href = \"https://techfios.com/billing/?ng=accounts/list/\"and text()=\"List Accounts\"]") WebElement LIST_ACCOUNTS_ELEMENT;


	
	public void validateDashboardPage(String expectedText) {
		try {
			Thread.sleep(2000);
			validateElement(DASHBOARD_VALIDATION_ELEMENT.getText(), expectedText, "Dashboard Page is not found!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnBankAndCashButton() {
		try {
			Thread.sleep(1500);
			BANK_AND_CASH_MENU_ELEMENT.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnNewAccountButton() {
		try {
			Thread.sleep(1500);
			NEW_ACCOUNT_MENU_ELEMENT.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnListAccountsButton() {
		try {
			Thread.sleep(1000);
			LIST_ACCOUNTS_ELEMENT.click();
			Thread.sleep(700);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
