package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Base;
import pages.BrokenImagePage;

public class testBrokenImages extends Base {

	@Test
	public void verifyIfImageBroken() {

		BrokenImagePage page = new BrokenImagePage(driver);

		page.openBrokenImagePage();

		for (WebElement img : page.getImageLinks()) {
			String imgUrl = img.getAttribute("src");

			// Send HTTP request to the image URL

			try {
				URL url = new URL(imgUrl);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();

				int responseCode = connection.getResponseCode();
				if (responseCode != 200) {
					System.out.println("Broken image detected: " + imgUrl + " | Status Code: " + responseCode);
				} else {
					System.out.println("Image loaded successfully: " + imgUrl);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error with image: " + imgUrl + " | Exception: " + e.getMessage());
			}

		}
	}
}
