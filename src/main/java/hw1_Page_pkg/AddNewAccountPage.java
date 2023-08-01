
// Selenium Class 11.d:- July 16, 2023, Sunday with Instructor Shihabul Khandakar (Shibab) 

package hw1_Page_pkg;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddNewAccountPage extends BasePage {

	
	
	
	
	
	
	
	
	// ==========================================================================

	WebDriver driver;
	WebDriverWait wait;

	
	// parameterizing the constructor to save it under a variable and globally declare in this class
	public AddNewAccountPage(WebDriver driver) {	
		this.driver = driver;
	}

	// WebElements:
	@FindBy(how = How.XPATH, using = "//h5[text()='Add New Account']") WebElement ADD_NEW_ACCOUNT_VALIDATION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account\"]") WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"description\"]") WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"balance\"]") WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account_number\"]") WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_person\"]") WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"ib_url\"]") WebElement INTERNET_BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class = \"btn btn-primary\" and @type = \"submit\"]") WebElement SUBMIT_ELEMENT;

	
	public void validateAddNewContactPage() {
		try {
			Thread.sleep(1500);
			String expectedText = "Add New Account";
			validateElement(ADD_NEW_ACCOUNT_VALIDATION_ELEMENT.getText(), expectedText, "Add New Contact Page is not found!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getAddContactPageTitle() {
		return driver.getTitle();
	}

	static String customizedAccountTitle;
	public static String getInsertedAccountTtile() {
		return customizedAccountTitle;
	}

	public void insertAccountTitle(String expectedText) {
		try {
			Thread.sleep(1000);
			customizedAccountTitle = expectedText + randomNumGenerator(9999);    
			ACCOUNT_TITLE_ELEMENT.sendKeys(customizedAccountTitle);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void insertDescription(String expectedText) {
		try {
			Thread.sleep(1000);
			DESCRIPTION_ELEMENT.sendKeys(expectedText);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static Double desiredBalance;
	public static Double getInsertedDesiredBalance() {
		return desiredBalance;
	}
	
	public void insertInitialBalance(String expectedText) {
		try {
			Thread.sleep(1000);
			desiredBalance = Double.parseDouble(expectedText);
			INITIAL_BALANCE_ELEMENT.sendKeys(desiredBalance.toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static Integer customizedAccountNumber;
	public static Integer getInsertedAccountNUmber() {
		return customizedAccountNumber;
	}

	public void insertAccountNumber(String expectedText) {
		try {
			Thread.sleep(1000);
			customizedAccountNumber = Integer.parseInt(expectedText);  
			ACCOUNT_NUMBER_ELEMENT.sendKeys(customizedAccountNumber.toString() + randomNumGenerator(99));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public void insertContactPerson(String expectedText) {
		try {
			Thread.sleep(1000);
			CONTACT_PERSON_ELEMENT.sendKeys(expectedText);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static Long customizedPhone;
	public static Long getInsertedPhone() {
		return customizedPhone;
	}

	public void insertPhone(String expectedText) {
		try {
			Thread.sleep(1000);
			customizedPhone = Long.parseLong(expectedText);   
			PHONE_ELEMENT.sendKeys(customizedPhone.toString() + randomNumGenerator(999));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void insertInternetBankingURL(String expectedText) {
		try {
			Thread.sleep(1000);
			INTERNET_BANKING_URL_ELEMENT.sendKeys(expectedText);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnSubmitButton() {
		try {
			Thread.sleep(1000);
			SUBMIT_ELEMENT.click();
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
