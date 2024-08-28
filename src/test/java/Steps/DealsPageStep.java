package Steps;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import io.cucumber.java.en.When;

public class DealsPageStep extends BaseClass {
	private DealsPage dealsPage;

	@When("user is click on deals page")
	public void user_is_click_on_deals_page() {
		dealsPage = new DealsPage();
		dealsPage.clickOnDealsLink();
	}

	@When("user click on crate button in deals Page")
	public void user_click_on_crate_button_in_deals_page() {
		dealsPage.clickOnCreateButton();
	}

	@When("user enter title")
	public void user_enter_title() {
		dealsPage.enterTitle("Test Engineer");
	}

	@When("user click on save button deals Page")
	public void user_click_on_save_button_deals_page() {
		dealsPage.clickOnSaveButton();
	}
}
