package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opecart.base.BaseTest;
import com.qa.opencart.constants.AppConstant;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("E101:Design Login for Opencart Application")
@Story("User Story US-01: Design Features for Login Page")
public class LoginPageTest extends BaseTest {
	@Severity(SeverityLevel.TRIVIAL)
	@Description("---Getting Title of Page--- Author:Pravin")

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		// Assert.assertEquals(actTitle, "Account Login");
		Assert.assertEquals(actTitle, AppConstant.LOGIN_PAGE_TITLE_VALUE);

	}
	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 2)
	public void loginPageUrlTest() {
		String actUrl = loginPage.getLoginUrl();
		// Assert.assertTrue(actUrl.contains("route=account/login"));
		Assert.assertTrue(actUrl.contains(AppConstant.LOGIN_PAGE_URL_FRACTION_VALUE));
	}

	@Test(priority = 3)
	public void forgotpassLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotpwdLinkExits());
	}

	@Test(priority = 4)
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest() {
		// loginPage.doLogin("pravinjunghare01@yahoo.com", "Test@1234");
		// accountsPage = loginPage.doLogin("hacaxa3208@craftapk.com", "Test@1234");
		accountsPage = loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		Assert.assertTrue(accountsPage.isLogoutLinkExist());
	}

}