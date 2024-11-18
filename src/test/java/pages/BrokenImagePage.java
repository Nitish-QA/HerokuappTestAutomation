package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImagePage extends BasePage {
	
	public BrokenImagePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Broken Images']")
	private WebElement brokenImagesPageLink;
	
	@FindBy(tagName = "img")
	private List<WebElement> allImagesLinks;
	
	public void openBrokenImagePage() {
		brokenImagesPageLink.click();
	}
	
	public List<WebElement> getImageLinks() {
		return allImagesLinks;
	}
}
