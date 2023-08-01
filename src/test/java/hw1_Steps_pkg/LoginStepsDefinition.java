
package hw1_Steps_pkg;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import hw1_Page_pkg.AddNewAccountPage;
import hw1_Page_pkg.DashboardPage;
import hw1_Page_pkg.LoginPage;
import hw1_Util_pkg.BrowserFactory_or_TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition extends BrowserFactory_or_TestBase {

	
	// Home work(Due on 08/05/2023 Saturday 09:00 am CST):
		// Automate following scenario by creating a new feature using Cucumber BDD Framework
		// (which was built in class#11 & 12) drive  e data  from Examples and push  e code   your own github/bitbucket reposito ry
		// and email  the project URL to  mdislam@live.com.
	
	
	// ========== =============== =============== ============ =============== =============== 
	
	
	LoginPage loginPage;
	DashboardPage dashbboardPage;
	AddNewAccountPage addContactPage;
	
	
	@Before
	public void setup() {

		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashbboardPage = PageFactory.initElements(driver, DashboardPage.class);
		addContactPage = PageFactory.initElements(driver, AddNewAccountPage.class);

	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
	}
	
	@When("User enters the {string} in the username field")   
	public void user_enters_username_as(String username) {    
		loginPage.insertUsername(username);
	}
	
	@When("User enters the {string} in the password field")
	public void user_enters_password_as(String password) {
	    loginPage.insertPassword(password);
	}

	@And("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}
	
	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Given("User is on the techfios dashboard page")
	public void user_should_land_on_the_techfios_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
//		takeScreenshot(driver);
	}
	
	@And ("User clicks on Bank and Cash")
	public void user_clicks_on_bank_and_cash () {
		dashbboardPage.clickOnBankAndCashButton();
	}
	
	@And ("User clicks on New Account")
	public void user_clicks_on_New_Account () {
		dashbboardPage.clickOnNewAccountButton();
	}
	
	@Then("User should land on Add Contact page")
	public void user_should_land_on_Add_Contact_page() {
		addContactPage.validateAddNewContactPage();
//		takeScreenshot(driver);
	}
	/*
	@Then("User should land on Add Contact page")
	public void user_should_land_on_Add_Contact_page() {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = addContactPage.getAddContactPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle, "Add New Contact Page is not found!");
//		takeScreenshot(driver);
	}
	*/
	
	@And ("User enters {string} in the accountTitle field in accounts page")
	public void User_enters_accountTitle_in_the_accountTitle_field(String accountTitle){
		addContactPage.insertAccountTitle(accountTitle);
	}
	
	@And ("User enters {string} in the description field in accounts page")
	public void User_enters_description_in_the_description_field(String description){
		addContactPage.insertDescription(description);
	}
	
	@And ("User enters {string} in the initialBalance field in accounts page")
	public void User_enters_initialBalance_in_the_initialBalance_field(String initialBalance){
		addContactPage.insertInitialBalance(initialBalance);
	}
	
	@And ("User enters {string} in the accountNumber field in accounts page")
	public void User_enters_accountNumber_in_the_accountNumber_field(String accountNumber){
		addContactPage.insertAccountNumber(accountNumber);
	}
	
	@And ("User enters {string} in the contactPerson field in accounts page")
	public void User_enters_contactPerson_in_the_contactPerson_field(String contactPerson){
		addContactPage.insertContactPerson(contactPerson);
	}
	
	@And ("User enters {string} in the phone field in accounts page")
	public void User_enters_phone_in_the_phone_field(String phone){
		addContactPage.insertPhone(phone);
	}
	
	@And ("User enters {string} in the internetBankingURL field in accounts page")
	public void User_enters_internetBankingURL_in_the_internetBankingURL_field(String internetBankingURL){
		addContactPage.insertInternetBankingURL(internetBankingURL);
	}
	
	@And ("User clicks on submit button")
	public void User_clicks_submit_button(){
		addContactPage.clickOnSubmitButton();
		takeScreenshot(driver);
	}
	
	@Then ("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		dashbboardPage.clickOnListAccountsButton();
		takeScreenshot(driver);
	}
	
	@After
	public void tearDown() {
		try {
			Thread.sleep(1500);
			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
