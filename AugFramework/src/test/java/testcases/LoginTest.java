package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BaseClass;
import pages.LogOut;
import pages.Login;

public class LoginTest extends BaseClass {

	Login login;
	LogOut logOut;

	@Test(description="",priority=1)
	public void loginToHRM() {

		login = PageFactory.initElements(driver, Login.class);

		logOut = PageFactory.initElements(driver, LogOut.class);

		logger = report.createTest("Login Test for OrangeHRM");

		login.validateHomePage();

		logger.pass("Home Page Validated");

		login.enterUserName();

		logger.info("Username entered");

		login.enterPassword();

		logger.info("Password entered");

		login.clickLoginButton();

		logger.info("Clicked on Login button ");

		logOut.logoutFromApplication();

		logger.pass("User is able to logout");
	}

	@Test(description="This test will add trainer")
	public void addTrainer() 
	{

	}

}
