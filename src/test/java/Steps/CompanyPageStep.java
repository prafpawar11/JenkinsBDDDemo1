package Steps;

import BaseLayer.BaseClass;
import PageLayer.CompanyPage;
import io.cucumber.java.en.When;

public class CompanyPageStep extends BaseClass {
	private CompanyPage companyPage;

	@When("user click on company link")
	public void user_click_on_company_link() {
		companyPage = new CompanyPage();
		companyPage.clickOnCompanyLink();
	}

	@When("user click on create button in company page")
	public void user_click_on_create_button_in_company_page() {
		companyPage.clickOnCreateButton();
	}

	@When("user enter company name")
	public void user_enter_company_name() {
		companyPage.enterCompanyName("Amdocs");
	}

	@When("user click on save button in company page")
	public void user_click_on_save_button_in_company_page() {
		companyPage.clickOnSaveButton();
	}

}
