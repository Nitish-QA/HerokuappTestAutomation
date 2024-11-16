package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;

public class AddRemoveElementPage extends BasePage {

	public AddRemoveElementPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Add/Remove Elements']")
	private WebElement addremovelink;

	@FindBy(xpath = "//h3[normalize-space()='Add/Remove Elements']")
	private WebElement pageHeader;

	@FindBy(xpath = "//button[normalize-space()='Add Element']")
	private WebElement addElementBtn;

	@FindBy(xpath = "//button[normalize-space()='Delete']")
	private List<WebElement> deleteBtns;

	public void clickAddRemoveLink() {
		addremovelink.click();
	}

	public String getPageHeader() {
		return pageHeader.getText();
	}

	public int getDeleteButtonCount() {
		return deleteBtns.size();
	}

	public void clickAddElement() {
		addElementBtn.click();
	}

	// Method to click all "Delete" buttons
	public void clickAllDeleteButtons() {
		for (WebElement deleteBtn : deleteBtns) {
			deleteBtn.click();
		}

	}
}
