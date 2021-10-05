package stepDefinations;

import base.TestBase;
import pages.loginPage;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CRMStepDefination {
	
	TestBase testbase;
	loginPage Lpage;
	//WebDriver driver;
	
	@Given("User is on login page")
	public void User_is_on_login_page()
	{
		testbase = new TestBase();
		testbase.initialize();
		
	}
	
	//parameterization from Feature file without Example Keyword
	@When("user enters {string} and {string} login details")
	public void user_enters_login_details(String strUser, String strPass)
	{
		Lpage = new loginPage();
		Lpage.login(strUser, strPass);
	}
	
	@Then("user is on the home page")
	public void user_is_on_the_home_page()
	{
		Lpage = new loginPage();
		boolean isValid = Lpage.IsLoggedIn();
		Assert.assertTrue(isValid);
	}
	
	@Then("close the browser")
	public void close_the_browser()
	{
		testbase = new TestBase();
		testbase.tearDown();
	}

}
