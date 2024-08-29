package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class CompanyPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/companies']")
	private WebElement companyLink;

	@FindBy(xpath = "//a[@href='/companies/new']")
	private WebElement createButton;

	@FindBy(name = "name")
	private WebElement companyName;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public CompanyPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCompanyLink() {
		Wait.click(companyLink);
	}

	public void clickOnCreateButton() {
		Wait.click(createButton);
	}

	public void enterCompanyName(String CompanyName) {
		Wait.sendKeys(companyName, CompanyName);
	}

	public void clickOnSaveButton() {
		Wait.click(saveButton);
	}
}
