package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProviderFactory.DataProviderFactory;
import helper.BaseClass;
import pages.LogOut;
import pages.Login;

public class LoginTestWithDataProvider extends BaseClass {

	Login login;
	LogOut logOut;

	@Test(dataProvider="LoginData")
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

	@DataProvider(name="LoginData")
	public Object[][] getDataFromSources()
	{
		
		System.out.println("LOG:INFO-Running Data Provider First to generate the data");
		
		int rows=DataProviderFactory.getExcel().getRows("Login");
		
		System.out.println("Total Rows in Excel "+rows );
		
		
		Object[][]arr=new Object[rows-1][2];
	
		for(int i=0;i<rows-1;i++)
		{
			arr[i][0]=DataProviderFactory.getExcel().getCellData("Login", i+1, 0);
			arr[i][1]=DataProviderFactory.getExcel().getCellData("Login", i+1, 1);
			
		}
		System.out.println("LOG:INFO-Data Provider is Ready for usage");

		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
