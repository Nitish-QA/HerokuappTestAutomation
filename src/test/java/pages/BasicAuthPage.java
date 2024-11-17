package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends BasePage {
	
	public BasicAuthPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Basic Auth']")
	private WebElement basicAuthLink;
	
	@FindBy(xpath = "//h3[normalize-space()='Basic Auth']")
	private WebElement pageHeader;
	
	
	public void openBasicAuth() {
		basicAuthLink.click();
	}
	
	public String getPageHeader() {
		return pageHeader.getText();	
	}

}
