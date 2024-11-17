package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.AddRemoveElementPage;

public class testAddRemoveElements extends Base {

	@Test
	public void testAddAndRemoveElements() throws InterruptedException {
        // Instantiate the page object
        AddRemoveElementPage page = new AddRemoveElementPage(driver);
        
        // Navigate to Add/Remove Elements page
        page.clickAddRemoveLink();
        
        // Verify that you are on the correct page by checking the header
        String actualHeader = page.getPageHeader();
        String expectedHeader = "Add/Remove Elements";
        Assert.assertEquals(actualHeader, expectedHeader, "Page header does not match. You are on the wrong page!");

        // Click the "Add Element" button 5 times to add five delete buttons
        for (int i = 0; i < 5; i++) {
            page.clickAddElement();
            Thread.sleep(2000);
        }
        // Verify the successful creation of "Delete" buttons count is 5
        int deleteButtonCount = page.getDeleteButtonCount();
        Assert.assertEquals(deleteButtonCount, 5, "Delete button count does not match!");

        // Click all "Delete" buttons
        page.clickAllDeleteButtons();

        // Verify that all "Delete" buttons are removed
        int remainingDeleteButtonCount = page.getDeleteButtonCount();
        Assert.assertEquals(remainingDeleteButtonCount, 0, "Not all Delete buttons were removed!");

	}

}
