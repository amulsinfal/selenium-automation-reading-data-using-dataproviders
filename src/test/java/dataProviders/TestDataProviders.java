package dataProviders;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
	
	@DataProvider(name = "validLoginData")
	public Object[][] getValidLoginData() {
		return new Object[][] { 
			{ "standard_user", "secret_sauce" },
			{ "problem_user", "secret_sauce" }
		};
	}
	
	@DataProvider(name = "lockedUserData")
	public Object[][] getlockedUserData() {
		return new Object[][] {
			{ "locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out." }
		};
	}
	
	@DataProvider(name = "invalidUserData")
	public Object[][] getInvalidUserData() {
		return new Object[][] {
			{ "invalid_user", "invalid_pass", "Epic sadface: Username and password do not match any user in this service" },
			{ "", "secret_sauce", "Epic sadface: Username is required" },
			{ "standard_user", "", "Epic sadface: Password is required" },
			{ "", "", "Epic sadface: Username is required" }
		};
	}

}