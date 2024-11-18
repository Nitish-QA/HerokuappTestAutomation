package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.CheckboxesPage;

public class testCheckBoxes extends Base {

	@Test
	public void verifyCheckBoxes() {
		CheckboxesPage page = new CheckboxesPage(driver);

		page.openCheckBoxesPage();

		String actualHeader = "Checkboxes";
		String expectedHeader = page.getPageHeader();

		Assert.assertEquals(expectedHeader, actualHeader, "Wrong Page is opened, page header not matching");

		for (WebElement element : page.getCheckBoxes()) {
			if (!element.isSelected()) {
			    element.click();
			    Assert.assertTrue(element.isSelected(), "Checkbox was not successfully checked.");
			    System.out.println("Checkbox successfully checked");
			} else {
			    element.click();
			    Assert.assertFalse(element.isSelected(), "Checkbox was not successfully unchecked.");
			    System.out.println("Checkbox successfully unchecked");
			}
		}
	}
}
