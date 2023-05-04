package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test(priority = 1)
	public void testValidLogin()
	{
		LoginPage loginPage=new LoginPage(driver);
//		1. enter valid un
		loginPage.setUserName("admin");
//		2. enter valid pw
		loginPage.setPassword("manager");
//		3. click login button
		loginPage.clickLoginButton();
//		4. home page should be displayed
		EnterTimeTrackPage homePage=new EnterTimeTrackPage(driver);
		boolean result = homePage.verifyHomePageIsDisplayed(wait);
		Assert.assertTrue(result);
	}
}
