package Steps;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.When;

public class ContactPageSteps extends BaseClass {
	private ContactPage contactPage;

	@When("user click on contact link")
	public void user_click_on_contact_link() {
		contactPage = new ContactPage();
		contactPage.clickOnContactLink();
	}

	@When("user click on create button")
	public void user_click_on_create_button() {
		contactPage.clickOnCreateButton();
	}

	@When("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {
		contactPage.enterFirstNameAndLastName("Rohit", "Patil");
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		contactPage.clickOnSaveButton();
	}

	@AfterStep
	public void t1() throws InterruptedException {
		Thread.sleep(2000);
	}
}
