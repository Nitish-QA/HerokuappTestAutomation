package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.BasicAuthPage;

public class testBasicAuth extends Base {
	
	@Test
	public void testBasicAuthorisation() {
		BasicAuthPage page = new BasicAuthPage(driver);
		
		page.openBasicAuth();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String actualHeader = page.getPageHeader();
		String expectedHeader = "Basic Auth";
		Assert.assertEquals(actualHeader, expectedHeader, "Page header does not match. You are on the wrong page!");
		
		
	}

}
