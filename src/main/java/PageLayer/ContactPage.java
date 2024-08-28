package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createbutton;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnContactLink() {
		Wait.click(contactLink);
	}

	public void clickOnCreateButton() {
		Wait.click(createbutton);
	}

	public void enterFirstNameAndLastName(String FirstName, String LastName) {
		Wait.sendKeys(firstName, FirstName);
		Wait.sendKeys(lastName, LastName);
	}

	public void clickOnSaveButton() {
		Wait.click(saveButton);
	}

}
