package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage {

	public CheckboxesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='Checkboxes']")
	private WebElement checkBoxesPageLink;

	@FindBy(xpath = "//h3[normalize-space()='Checkboxes']")
	private WebElement pageHeader;

	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> checkBoxes;

	public void openCheckBoxesPage() {
		checkBoxesPageLink.click();
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public List<WebElement> getCheckBoxes(){
		return checkBoxes;
	}

}
