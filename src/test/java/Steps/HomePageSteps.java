package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps extends BaseClass {
	private HomePage homePage;

	@Given("user is on home page and  validate logo")
	public void user_is_on_home_page_and_validate_logo() {
		homePage = new HomePage();
		Assert.assertEquals(homePage.checklogoStatus(), true);
	}

	@Given("user validate home page title")
	public void user_validate_home_page_title() {
		Assert.assertEquals(homePage.getTitle(), "Cogmento CRM");
	}

	@Given("user validate home page logo")
	public void user_validate_home_page_logo() {
		Assert.assertEquals(homePage.getCurrentUrl().contains("cogmento"), true);
	}

}
