package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	private LoginPage loginPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initilization();
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() {
		loginPage = new LoginPage();
		loginPage.enterUsernameAndPassword(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@AfterAll
	public static void tearDown() {
		driver.quit();
	}

}
