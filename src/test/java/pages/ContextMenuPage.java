package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContextMenuPage extends BasePage{
	
	public ContextMenuPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Context Menu']")
	private WebElement contextMenuLink;
	@FindBy(xpath = "//h3[normalize-space()='Context Menu']")
	private WebElement contextMenuHeader;
	@FindBy(xpath = "//div[@id='hot-spot']")
	private WebElement contextMenuBox;
	
	
	public void openContextMenuPage() {
		contextMenuLink.click();
	}
	
	public String getContextMenuHeader() {
		return contextMenuHeader.getText();
	}
	
	public WebElement getContextMenuBox() {
		return contextMenuBox;
	}

}
