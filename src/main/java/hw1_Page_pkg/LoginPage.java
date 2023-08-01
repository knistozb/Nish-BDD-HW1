
package hw1_Page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	
	
	
	
	// ========== =============== =============== ============ =============== =============== ============ =============== 

	
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library:
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SIGN_IN_BUTTON_ELEMENT;

	
	// Methods to interact with the elements
	public void insertUsername(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SIGN_IN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	

}
