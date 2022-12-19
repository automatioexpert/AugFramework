package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dataProviderFactory.DataProviderFactory;
import helper.Utility;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	//@FindBy(id="txtUsername") WebElement username;
	@FindBy(id="txtPassword") WebElement password;
	@FindBy(xpath="//input[@value='LOGIN']") WebElement loginButon;
	By username=By.id("txtUsername");
	
	
	
	public void validateHomePage()
	{
		Utility.validatingContainsTitle(driver, "OrangeHRM");
	}
	
	
	public void enterUserName(String uname)
	{
		System.out.println("LOG:INFO Username Entered");
		Utility.waitForWebElement(driver, username).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		System.out.println("LOG:INFO Password Entered");
		Utility.waitForWebElement(driver, password).sendKeys(pass);
	}
	
	
	public void enterUserName()
	{
		System.out.println("LOG:INFO Username Entered");
		Utility.waitForWebElement(driver,username).sendKeys(DataProviderFactory.getExcel().getCellData("Login", 1, 0));
	}
	
	public void enterPassword()
	{
		System.out.println("LOG:INFO Password Entered");
		Utility.waitForWebElement(driver, password).sendKeys(DataProviderFactory.getExcel().getCellData("Login", 1, 1));
	}
	
	
	
	public void clickLoginButton()
	{	
		Utility.waitForWebElement(driver, loginButon).click();
		System.out.println("LOG:INFO Clicked on login button");
	}
	
	
}
