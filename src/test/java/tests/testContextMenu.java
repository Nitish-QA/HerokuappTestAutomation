package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.ContextMenuPage;

public class testContextMenu extends Base{
	
	@Test
	public void verifyContextMenuAlert() {
		ContextMenuPage page = new ContextMenuPage(driver);
		
		page.openContextMenuPage();
		
		String actualHeader = page.getContextMenuHeader();
		String expectedHeader = "Context Menu";
		Assert.assertEquals(expectedHeader, actualHeader, "Wrong Page is opened, page header not matching");
		
		Actions act = new Actions(driver);
		act.contextClick(page.getContextMenuBox()).perform();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText  = alert.getText();
		Assert.assertEquals(alertText, "You selected a context menu");	
		
		alert.accept();
	}

}
