package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class loginPage extends TestBase{
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement validate;
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
		public void login(String struser, String strpwd)
		{
			username.sendKeys(struser);
			password.sendKeys(strpwd);
			login.click();
		}
		
		public boolean IsLoggedIn()
		{
			return validate.isDisplayed();
		}

}
