package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BaseClass;
import pages.LogOut;
import pages.Login;

public class LoginTestWithDataProvider2 extends BaseClass {

	Login login;
	LogOut logOut;

	@Test(dataProvider="LoginData",dataProviderClass=TestNGDataProviders.class)
	public void loginToHRM(String uname,String pass) {

		login = PageFactory.initElements(driver, Login.class);

		logOut = PageFactory.initElements(driver, LogOut.class);

		logger = report.createTest("Login Test for OrangeHRM");

		login.validateHomePage();

		logger.pass("Home Page Validated");

		login.enterUserName(uname);

		logger.info("Username entered");

		login.enterPassword(pass);

		logger.info("Password entered");

		login.clickLoginButton();

		logger.info("Clicked on Login button ");

		logOut.logoutFromApplication();

		logger.pass("User is able to logout");
	}

}
