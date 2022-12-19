package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {

	
	@Test
	public void test1() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserName", "android");
	    caps.setCapability("device", "Samsung Galaxy S9");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "8.0");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
		
		WebDriver driver=new RemoteWebDriver(new URL("https://mukeshotwani3:s4GTbs4fFzQxJxzpzp2f@hub-cloud.browserstack.com/wd/hub"), caps);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver Tutorials");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}
	
}
