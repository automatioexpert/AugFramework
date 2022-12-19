package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@When("user open browser")
	public void user_open_browser() { 
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	@Given("when user enter username")
	public void when_user_enter_username() {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

	@Given("when user enter password")
	public void when_user_enter_password() {
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		   driver.findElement(By.id("btnLogin")).click();

	}

	@When("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("User is on home page");
	}

	@Then("user should be able to see all social links")
	public void user_should_be_able_to_see_all_social_links() {
	    System.out.println("user is able to use all links");
	}
	
}
