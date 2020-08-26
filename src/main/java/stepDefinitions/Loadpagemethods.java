package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Loadpagemethods {
	public  WebDriver driver;
	
	@Given("^user is on website \"([^\"]*)\"$")
	public void user_on_website(String url) {
		
		System.out.println("User is on website");
		
	/*
		System.setProperty("webdriver.chromedriver", "C:\\practice\\jarfiles downloaded\\"
				+ "browserdrivers\\chromedriver");
		
		System.setProperty("webdriver.geckodriver.driver", 
				 "C:\\practice\\jarfiles downloaded\\geckodriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://www.freecrm.com");
		
		driver.get (url);
		*/
	}
	
	@When("^title of login page is displayed$")
	public void title_of_login_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // String title = driver.getTitle();
	   
	    System.out.println("Title of the page");
	}

	@Then("^user enters details$")
	public void user_enters_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	driver.findElement(By.name("email")).sendKeys("skumarhr@yahoo.com");
		//driver.findElement(By.name("password")).sendKeys("Test@123");
		
		 System.out.println("Details entered on the page");
	    
	}

	@Then("^user clicks on testlink$")
	public void user_clicks_on_titlelink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("User clicks test link");
	    
	}
	
	@Then("^user is on test page$")
	public void user_is_on_test_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("user is on the expected page");
		
		//driver.quit();
	}

	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}
	
}
