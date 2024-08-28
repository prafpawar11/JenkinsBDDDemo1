package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class DealsPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/deals']")
	private WebElement dealsLink;

	@FindBy(xpath = "//a[@href='/deals/new']")
	private WebElement createbutton;

	@FindBy(xpath = "//input[@name='title']")
	private WebElement title;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDealsLink()
	{
		Wait.click(dealsLink);
	}
	
	public void clickOnCreateButton()
	{
		Wait.click(createbutton);
	}
	
	public void enterTitle(String Title)
	{
		Wait.sendKeys(title, Title);
	}
	
	public void clickOnSaveButton()
	{
		Wait.click(saveButton);
	}
	
	
	
	
	
	
	
	
}
