package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import dataProviders.TestDataProviders;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends BaseTest {
	
	@Test (priority = 1, groups = {"Sanity"}, dataProvider = "validLoginData", dataProviderClass = TestDataProviders.class, description = "Test to verify login with valid credentials.") 
	public void testValidLogin(String userName, String password) {
		LoginPage loginPage = new LoginPage(driver);
		ProductsPage productsPage = loginPage.login(userName, password);
		assertTrue(productsPage.isPageDisplayed(),"Products Page is not displayed.");
	}
	
	@Test (priority = 2, groups = {"Regression"}, dataProvider = "lockedUserData", dataProviderClass = TestDataProviders.class, description = "Test to verify login with locked user credentials.") 
	public void testLockedUserLogin(String userName, String password, String errorMessage) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(userName, password);
		assertEquals(loginPage.getErrorText(),errorMessage,"Error message displayed is incorrect.");
	}

	@Test (priority = 3, groups = {"Regression"}, dataProvider = "invalidUserData", dataProviderClass = TestDataProviders.class, description = "Test to verify login with locked user credentials.") 
	public void testInvalidUserLogin(String userName, String password, String errorMessage) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(userName, password);
		assertEquals(loginPage.getErrorText(),errorMessage,"Error message displayed is incorrect.");
	}

}
