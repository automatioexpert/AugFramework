package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut {

	WebDriver driver;
	
	public LogOut(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="welcome")
	WebElement welcomeText;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutButton;
	
	public void logoutFromApplication()
	{
		welcomeText.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		logoutButton.click();
	}
	
	
}
