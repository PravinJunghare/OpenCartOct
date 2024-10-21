package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opecart.base.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, "Account Login");

	}

	@Test(priority = 2)
	public void loginPageUrlTest() {
		String actUrl = loginPage.getLoginUrl();
		Assert.assertTrue(actUrl.contains("route=account/login"));

	}

	@Test(priority = 3)
	public void forgotpassLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotpwdLinkExits());
	}

	@Test(priority = 4)
	public void loginTest() {
		loginPage.doLogin("hixiken531@leacore.com", "Test@1234");

	}
}
