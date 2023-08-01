

package hw1_Steps_pkg;

import org.openqa.selenium.support.PageFactory;

import hw1_Page_pkg.DashboardPage;
import hw1_Page_pkg.LoginPage;
import hw1_Util_pkg.BrowserFactory_or_TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DashboardSteps extends BrowserFactory_or_TestBase {

	/*
	DashboardPage dashbboardPage;
	LoginPage loginPage;

	
	public void linkingDifferentPages() {
		dashbboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
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
	*/
}
